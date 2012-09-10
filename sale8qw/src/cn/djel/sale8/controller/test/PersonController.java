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
	
	@RequestMapping("/person/toAdd")
    public String toAddPerson(){
    	
		return"/text/add";
    }
	
	@RequestMapping("/person/add")
	public String addperson(HttpServletRequest request ,HttpServletResponse response) {
	//	System.out.println(name+age+sex+password);
//		Person p = new Person();
//		p.setName("ssssa");
//		p.setPassword("sssa");
//		p.setAge(223);
//		p.setSex("falemana");
//以上代码做测试		
		Person per = assemPerson(request);
		personService.insertPerson(per);
		List<Person> li = personService.getAllPerson();
	//	System.out.println(li.size());
		return "/test/add";

	}
	public String edit(){
		return null;
		
	}
	public String update(){
		return null;
		
	}
	public String listPerson(){
		return null;
		
	}
	
   private Person assemPerson(HttpServletRequest request ){
	 Person per = new Person();
	    String id = request.getParameter("id");   
	    if(id !=null && !id.equals("")){
	    	per.setId(Integer.parseInt(id));
	    }
		String name = request.getParameter("name");
		if(name != null && !name.equals("")){
			per.setName(name);
		}
		String age = request.getParameter("age");
		if(age !=null && !age.equals("")){
			per.setAge(Integer.parseInt(age));
		}
		String sex = request.getParameter("sex");
		if(sex != null && !sex.equals("")){
			per.setSex(sex);
		}
		String password = request.getParameter("password");
		if(password != null && !password.equals("")){
			per.setPassword(password);
		}
	   
	   return per;
	   
   }

}
