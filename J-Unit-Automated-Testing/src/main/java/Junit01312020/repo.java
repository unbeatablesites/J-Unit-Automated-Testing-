package Junit01312020;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface repo extends JpaRepository<Form, Integer> {

List<Form> findByFirstName(String firstName);

List<Form> findByLastName(String lastName);

Form findFormById(Integer id);

}
