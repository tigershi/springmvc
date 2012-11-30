package cn.djel.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.djel.service.IHelloWorld;

public class Client {
	 public static void main(String[] args) {  
		        invokeBySpring();  
		     }  
		       
		     /** 
		      * Õ®π˝Spring≤‚ ‘webservices 
		      */  
		     public static void invokeBySpring(){  
		         ApplicationContext context = new ClassPathXmlApplicationContext("context-spring.xml");  
		         IHelloWorld helloServices = (IHelloWorld) context.getBean("clientService");  
		         helloServices.say();
		        String ss =  helloServices.sayHi("xiao");
		         System.out.println("web"+ss) ;
		         
		     }  
		       

}
