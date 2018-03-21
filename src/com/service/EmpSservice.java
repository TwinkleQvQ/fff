package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Emp;
import com.mapper.EmpMapper;

@Repository
@Transactional
public class EmpSservice {
	
	@Resource
	private EmpMapper empMapper;
	
	//查询所有
	public List<Emp> listEmp(){
		return empMapper.listEmp();
	}
	
	//删除
	public void deleteEmp(Integer eid) {
		empMapper.deleteEmp(eid);
	}
	
	//修改
	public void updateEmp(Emp emp) {
		empMapper.updateEmp(emp);
	}
	
	//根据 eid 查询
	public Emp getbyidEmp(Integer eid) {
		return empMapper.getbuidEmp(eid);
	}
	//增加

	

	
	
	
}
