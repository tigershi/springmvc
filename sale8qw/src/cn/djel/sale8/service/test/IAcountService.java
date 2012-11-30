package cn.djel.sale8.service.test;

import java.util.List;

import cn.djel.sale8.domain.test.Acount;

public interface IAcountService {
 public void insertAcount(Acount acount);
 public List<Acount> getAcounts();
}
