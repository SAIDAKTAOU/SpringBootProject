package univ.fac.master.dao;
import java.util.Hashtable;

import univ.fac.master.entity.Person;

public interface IPersonneDao {

Hashtable<Long,Person> findAllPersons();
Person addPerson(Person person);
Person updatePerson(Person person);
Person deletePerson(Long id);
Person findPersonById(Long id);

}
