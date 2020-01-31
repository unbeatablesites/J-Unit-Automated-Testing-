package com.FrankUzoka.JUnitAutomatedTesting;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class repoTest {

    @Autowired repo repo1;

    @Test
    void findByFirstName() {

        Form form1 = new Form();
        form1.setId(3);
        form1.setFirstName("Ike");
        form1.setLastName("Uzoka");

        Form newForm = repo1.add(form1);





    }

    @Test
    void findByLastName() {
    }

    @Test
    void findFormById() {
    }
}