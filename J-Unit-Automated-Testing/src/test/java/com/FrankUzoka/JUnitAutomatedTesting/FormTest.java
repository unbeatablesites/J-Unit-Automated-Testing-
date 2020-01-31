package com.FrankUzoka.JUnitAutomatedTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormTest {




    @Test
    void getId() {

        Form form = new Form();
        form.setId(1);
        assertEquals(1,form.getId());
    }

    @Test
    void setId() {

        Form form = new Form();
        form.setId(1);
        assertEquals(1,form.getId());

    }

    @Test
    void getFirstName() {

        Form form = new Form();
        form.setFirstName("Frank");
        assertEquals("Frank",form.getFirstName());
    }

    @Test
    void setFirstName() {
        Form form = new Form();
        form.setFirstName("Frank");
        assertEquals("Frank",form.getFirstName());
    }

    @Test
    void getLastName() {
        Form form = new Form();
        form.setLastName("Uzoka");
        assertEquals("Uzoka",form.getLastName());
    }

    @Test
    void setLastName() {
        Form form = new Form();
        form.setLastName("Uzoka");
        assertEquals("Uzoka",form.getLastName());
    }
}