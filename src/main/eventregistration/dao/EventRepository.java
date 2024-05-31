package eventregistration.dao;

import org.springframework.data.repository.CrudRepository;

import eventregistration.model.Event;

public interface EventRepository extends CrudRepository<Event, String> {
	
	Event findByName(String name);

}
