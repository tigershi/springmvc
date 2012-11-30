package cn.djel.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import cn.djel.service.IHelloWorld;

@WebService(endpointInterface="cn.djel.service.IHelloWorld")
public class HelloWorldImpl implements IHelloWorld{

	@Override
	@WebMethod
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("helloword");
		
	}

	@Override
	@WebMethod
	public @WebResult(name="replysay") 
	String sayHi(@WebParam(name="user") String user) {
		// TODO Auto-generated method stub
		String ss ="hello baby"+user;
		return ss;
	}
	

}
