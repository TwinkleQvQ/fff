package com.mapper;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.bean.Emp;

@Repository
public class EmpMapper {
	
	@Resource
	private SessionFactory sessionFactory;
	
	public Session getsession() {
		return sessionFactory.getCurrentSession();
	}
	
	//��ѯ����
	public List<Emp> listEmp(){
		String hql = "from Emp";
		List list = getsession().createQuery(hql).list();
		return list;
	}
	
	//�޸�
	public void updateEmp(Emp emp) {
		getsession().update(emp);
	}
	
	//ɾ��
	public void deleteEmp(Integer eid) {
		getsession().delete(getbuidEmp(eid));
	}
	
	//���� id ��ѯԱ��
	public Emp getbuidEmp(Integer eid) {
		System.out.println(eid);
		return (Emp) getsession().get(Emp.class, eid);
	}
	
	//���
	public void saveEmp(Emp emp) {
		getsession().save(emp);
	}
	
}

