package univ.fac.master.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import univ.fac.master.dao.IPersonneDao;
import univ.fac.master.dao.PersonDaoImpl;
import univ.fac.master.entity.Person;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class Controlleur {
	IPersonneDao personDao=new PersonDaoImpl();
 @GetMapping("/form")
	public ModelAndView form() {
	return new ModelAndView("personform.html");
	 
		}
 @PostMapping("/personnes")
 public Person addPerson(@RequestBody Person person) {
	 return personDao.addPerson(person);
 }
 
 @PutMapping("/personnes")
 public Person updatePersonPerson(@RequestBody Person person) {
	 return personDao.updatePerson(person);
 }
 
 @GetMapping("/personnes")
	public Collection<Person> getAllPersons() {	 
	return personDao.findAllPersons().values();	 
		}
 
 @GetMapping("/personnes/{id}")
	public Person getPersonById(@PathVariable(value="id") Long id) {	 
	return personDao.findPersonById(id);	 
		}
 
 @DeleteMapping("/personnes/{id}")
	public Person deletePersonById(@PathVariable(value="id") Long id) {	 
	return personDao.deletePerson(id);	 
		}
 
}
  