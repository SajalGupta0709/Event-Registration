package eventregistration.dao;

import org.springframework.data.repository.CrudRepository;

import eventregistration.model.Person;

public interface PersonRepository extends CrudRepository<Person, String>{
	
	Person findPersonByName(String name);
	
}
