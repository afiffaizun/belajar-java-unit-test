package service;

import data.Person;
import repository.PersonRepository;

public class PersonService {
	
	private PersonRepository personRepository;
	
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public Person get(String id) {
		Person person = personRepository.selectById(id);
		
		if ( person != null) {
			return person;
		} else {
			throw new IllegalArgumentException("Person not found");
		}
	}
}
