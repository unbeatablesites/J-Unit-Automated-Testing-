package com.FrankUzoka.JUnitAutomatedTesting;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;


class repoTest {

    @Autowired repo repo1;

    @Test
    void findByFirstName() {

        Form form = new Form();
        form.setFirstName("Ike");
        form.setLastName("Uzoka");

        Form newForm = repo1.add(form);

        assertEquals("Ike", newForm.getFirstName());




    }

    @Test
    void findByLastName() {
    }

    @Test
    void findFormById() {
    }
}