package com.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Emp {
	
	@Id
	@GeneratedValue
	private Integer eid;
	private String ename;
	private String sex;
	private Integer age;
	
	
	
	public Emp() {
		super();
	}
	public Emp(Integer eid, String ename, String sex, Integer age) {
		this.eid = eid;
		this.ename = ename;
		this.sex = sex;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", sex=" + sex + ", age=" + age + "]";
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
	
}
