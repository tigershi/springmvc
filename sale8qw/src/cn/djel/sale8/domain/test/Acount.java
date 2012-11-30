package cn.djel.sale8.domain.test;

import java.io.Serializable;

public class Acount implements Serializable {
 /**
	 * 
	 */
private static final long serialVersionUID = -1238774392414831894L;
private String name;
 public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getCount() {
	return count;
}
public void setCount(Double count) {
	this.count = count;
}
private Double count;
}
