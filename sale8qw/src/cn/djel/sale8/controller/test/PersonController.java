package cn.djel.sale8.controller.test;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.djel.sale8.domain.test.Person;
import cn.djel.sale8.service.test.IPersonService;

@Controller
public class PersonController {
	@Resource(name = "personService")
	private IPersonService personService;
	
	public void setPersonService(IPersonService personService) {
		this.personService = personService;
	}

	@RequestMapping("/person/add")
	public String insertperson(HttpServletRequest request ,HttpServletResponse response) {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String sex = request.getParameter("sex");
		String password = request.getParameter("password");
		
		System.out.println(name+age+sex+password);
		Person p = new Person();
		p.setName("ssssa");
		p.setPassword("sssa");
		p.setAge(223);
		p.setSex("falemana");
		personService.insertPerson(p);
		// personService.insertPerson(model);
		List<Person> li = personService.getAllPerson();
		System.out.println(li.size());
		return "/test/add";

	}
   

}
