package com.weijie.oa.test;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.weijie.oa.domain.User;
//�Զ�װ�䵽bean��
@Service("testService")
public class TestService {
	//ͨ��ע��ķ�ʽ�������л�ȡ��sessionFactory
	@Resource
	private SessionFactory sessionFactory;
	
	//ע�⿪������ ע��session�����������е�session������openSession�õ���
	//�����openSession��session��Ϊȫ�µ�session��û��������	
	@Transactional
	public void addTwoUsers(){
		Session session = sessionFactory.getCurrentSession();
		session.save(new User());
		//int i = 1 / 0;//���л����쳣
		session.save(new User());
	}
}
