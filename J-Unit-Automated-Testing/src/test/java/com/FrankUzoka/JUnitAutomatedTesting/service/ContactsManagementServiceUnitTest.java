package com.FrankUzoka.JUnitAutomatedTesting.service;

import com.FrankUzoka.JUnitAutomatedTesting.domain.CustomerContact;
import com.FrankUzoka.JUnitAutomatedTesting.repos.CustomerContactRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
// Working
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class ContactsManagementServiceUnitTest {

	@Mock
	private CustomerContactRepository customerContactRepository;

	@InjectMocks
	private ContactsManagementService contactsManagementService;


	@Before
    public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testAddContactHappyPath() {

		// Create a contact
		CustomerContact aMockContact = new CustomerContact();
		aMockContact.setFirstName("Jenny");
		aMockContact.setLastName("Johnson");

		when(customerContactRepository.save(any(CustomerContact.class))).thenReturn(aMockContact);

		// Save the contact
		CustomerContact newContact = contactsManagementService.add(null);


		// Verify the save
		assertEquals("Jenny", newContact.getFirstName());
	}
}
