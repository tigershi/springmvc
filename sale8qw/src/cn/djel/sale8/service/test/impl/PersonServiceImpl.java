package cn.djel.sale8.service.test.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.djel.sale8.dao.test.PersonMapper;
import cn.djel.sale8.domain.test.Person;
import cn.djel.sale8.service.test.IPersonService;


 @Transactional
public class PersonServiceImpl implements IPersonService{

	@Resource(name="personMapper")
	private PersonMapper personMapper;
	 
	public void setPersonMapper(PersonMapper personMapper) {
		this.personMapper = personMapper;
	}
	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<Person> getPersonByName(String name) {
		// TODO Auto-generated method stub
		personMapper.getPersonByName(name);
		return personMapper.getPersonByName(name);
	}
	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		
		return personMapper.getAllPerson();
	}

	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public Person getPerson(String name) {
		// TODO Auto-generated method stub
		return personMapper.getPerson(name);
	}

	@Override
	public void insertPerson(Person Person) {
		// TODO Auto-generated method stub
		System.err.println(Person.getName()+Person.getId());
		personMapper.insertPerson(Person);
	}

	@Override
	public void updatePerson(Person Person) {
		// TODO Auto-generated method stub
		personMapper.updatePerson(Person);
	}

	@Override
	public void deletePerson(int id) {
		// TODO Auto-generated method stub
		personMapper.deletePerson(id);
	}
   
}
