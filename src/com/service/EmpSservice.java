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
	
	//��ѯ����
	public List<Emp> listEmp(){
		return empMapper.listEmp();
	}
	
	//ɾ��
	public void deleteEmp(Integer eid) {
		empMapper.deleteEmp(eid);
	}
	
	//�޸�
	public void updateEmp(Emp emp) {
		empMapper.updateEmp(emp);
	}
	
	//���� eid ��ѯ
	public Emp getbyidEmp(Integer eid) {
		return empMapper.getbuidEmp(eid);
	}
	//����

	

	
	
	
}
