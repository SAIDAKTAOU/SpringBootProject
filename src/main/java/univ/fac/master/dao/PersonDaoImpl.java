package univ.fac.master.dao;

import java.util.Hashtable;

import univ.fac.master.entity.Person;

public class PersonDaoImpl implements IPersonneDao{
	Hashtable<Long, Person> personnes=new Hashtable<Long,Person>();

	@Override
	public Hashtable<Long, Person> findAllPersons() {

		return this.personnes;
	}

	@Override
	public Person addPerson(Person person) {
		personnes.putIfAbsent(person.getId() , person);
		return person;
	}

	@Override
	public Person updatePerson(Person person) {
		personnes.put(person.getId(), person);
		return person;
	}

	@Override
	public Person deletePerson(Long id) {
		Person p=findPersonById(id);
		personnes.remove(id);
		return p;
	}

	@Override
	public Person findPersonById(Long id) {
		
		return personnes.get(id);
	}
	
	
}
