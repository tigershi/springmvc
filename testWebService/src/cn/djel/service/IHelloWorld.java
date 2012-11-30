package cn.djel.service;

import javax.jws.WebService;

@WebService
public interface IHelloWorld {
 public void say();
 public String sayHi(String user);
}
