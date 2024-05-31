package eventregistration.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import eventregistration.model.Event;
import eventregistration.model.Person;
import eventregistration.model.Registration;

public interface RegistrationRepository extends CrudRepository<Registration, Integer> {
    
    List<Registration> findByPerson(Person personName);
    
    boolean existsByPersonAndEvent(Person person, Event eventName);
    
    Registration findByPersonAndEvent(Person person, Event eventName);
    
}
