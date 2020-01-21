package com.FrankUzoka.JUnitAutomatedTesting.repos;

import com.FrankUzoka.JUnitAutomatedTesting.domain.CustomerContact;
import org.springframework.data.repository.CrudRepository;

public interface CustomerContactRepository extends CrudRepository<CustomerContact, Long> {

}
