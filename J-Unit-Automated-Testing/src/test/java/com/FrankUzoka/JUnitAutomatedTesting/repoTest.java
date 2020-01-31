package com.FrankUzoka.JUnitAutomatedTesting;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class repoTest {

    @Autowired repo repo1;

    @Test
    void findByFirstName() {

        Form form = new Form();

        form.setId(3);
        form.setFirstName("Ike");
        form.setLastName("Uzoka");

        Form newForm = repo1.add(form);




    }

    @Test
    void findByLastName() {
    }

    @Test
    void findFormById() {
    }
}