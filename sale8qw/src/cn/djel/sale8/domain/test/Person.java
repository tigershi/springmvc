package cn.djel.sale8.domain.test;

import java.io.Serializable;

public class Person  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1316367219360684183L;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	  
	
	
	    private int id;  
		private String name;  
	    private int age;  
	    private String sex;  
	    private String password;  

}
