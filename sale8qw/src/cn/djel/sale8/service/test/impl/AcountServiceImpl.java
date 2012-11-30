package cn.djel.sale8.service.test.impl;

import java.util.List;

import cn.djel.sale8.domain.test.Acount;
import cn.djel.sale8.service.test.IAcountService;

public class AcountServiceImpl implements IAcountService{

	@Override
	public void insertAcount(Acount acount) {
		// TODO Auto-generated method stub
		System.out.println("hello insert");
	}

	@Override
	public List<Acount> getAcounts() {
		// TODO Auto-generated method stub
		System.out.print("hello get");
		return null;
	}

}
