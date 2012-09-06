package cn.djel.sale8.service.test;

import java.util.List;

import cn.djel.sale8.domain.test.Person;



public interface IPersonService {
	
   public List<Person> getPersonByName(String name);  
    
    public List<Person> getAllPerson();  
  
    public Person getPerson(String name);  
      
  
    public void insertPerson(Person Person);  
      

    public void updatePerson(Person Person);  
      

    public void deletePerson(int id);  
}
