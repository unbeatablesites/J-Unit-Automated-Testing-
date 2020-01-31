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
    }

    @Test
    void getFirstName() {
    }

    @Test
    void setFirstName() {
    }

    @Test
    void getLastName() {
    }

    @Test
    void setLastName() {
    }
}