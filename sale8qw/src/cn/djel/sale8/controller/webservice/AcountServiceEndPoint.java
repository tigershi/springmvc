package cn.djel.sale8.controller.webservice;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import cn.djel.sale8.domain.test.Acount;
import cn.djel.sale8.service.test.IAcountService;

@WebService(serviceName="AcountService")
public class AcountServiceEndPoint {
	
	@Autowired
	private IAcountService acountService;
	
	
	
	@WebMethod
	public void insertAcount(Acount ac){
		acountService.insertAcount(ac);
	}
	@WebMethod
	 public List<Acount> getAcounts(){
		 return acountService.getAcounts();
		 
	 }
	
}
