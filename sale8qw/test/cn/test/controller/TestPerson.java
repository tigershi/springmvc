package cn.test.controller;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.djel.sale8.domain.test.Person;
import cn.djel.sale8.service.test.IPersonService;
import cn.djel.sale8.service.test.impl.PersonServiceImpl;


public class TestPerson {

	  private IPersonService personService = new PersonServiceImpl();
@Test
  public void insert(){
	//ClassPathXmlApplicationContext cp =  new ClassPathXmlApplicationContext("applicationcontext.xml");
	  IPersonService personService = new PersonServiceImpl();
	  Person p = new Person();
	  p.setId(4);
	  p.setName("ssss");
	  p.setPassword("sss");
	  p.setAge(22);
	  p.setSex("faleman");
	  personService.insertPerson(p);
  }
  public void getAllP(){
	   
	  List<Person> sli =  personService.getAllPerson();
	  for(Person p: sli){
		  System.out.println(p.getId());
	  }
  }
  @Test
  public void testjdbc (){
	  ClassPathXmlApplicationContext cp =  new ClassPathXmlApplicationContext("applicationcontext.xml");
	  IPersonService personService = (IPersonService) cp.getBean("personService");
      Person p = new Person();
	  p.setName("ssss");
	  p.setPassword("sss");
	  p.setAge(22);
	  p.setSex("faleman");
      personService.insertPerson(p);
     
      List<Person> sli =  personService.getAllPerson();
      System.out.println(sli.size());
	  for(Person ps: sli){
		  System.out.println(ps.getId());
	  }
  }
  @Test
  public void testString(){
	  String[] ss = {"ssws","ssdfsd","sdfsdfs"};
	  for(String s :ss){
		  System.out.println(s);
	  }
	  System.out.println(ss.toString());
  }
  
  @Test
 public void testservice(){
	 ClassPathXmlApplicationContext cp =  new ClassPathXmlApplicationContext("applicationcontext.xml");
	  IPersonService personService = (IPersonService) cp.getBean("personService");
      Person p = new Person();
	 // p.setId(4);
	  p.setName("ssss");
	  p.setPassword("sss");
	  p.setAge(22);
	  p.setSex("faleman");
      personService.insertPerson(p);
    
     List<Person> sli =  personService.getAllPerson();
	  for(Person ps: sli){
		  System.out.println(ps.getId());
	  }
 }
 public static void main(String[] args) {
	TestPerson p = new TestPerson();
	p.insert();
	//p.getAllP();
}
}
