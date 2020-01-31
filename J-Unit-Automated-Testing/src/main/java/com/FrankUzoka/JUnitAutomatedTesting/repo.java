package com.FrankUzoka.JUnitAutomatedTesting;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface repo extends JpaRepository<Form, Integer> {

    /**
     *
     * @param firstName
     * @return
     */
    List<Form> findByFirstName(String firstName);

    /**
     *
     * @param lastName
     * @return
     */
    List<Form> findByLastName(String lastName);

    /**
     *
     * @param id
     * @return
     */
    Form findFormById(Integer id);

}
