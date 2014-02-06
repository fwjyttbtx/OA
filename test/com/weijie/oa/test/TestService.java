package com.weijie.oa.test;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.weijie.oa.domain.User;
//自动装配到bean中
@Service("testService")
public class TestService {
	//通过注解的方式从容器中获取到sessionFactory
	@Resource
	private SessionFactory sessionFactory;
	
	//注解开启事务 注意session必须是容器中的session不能是openSession得到的
	//如果是openSession的session则为全新的session就没有事务了	
	@Transactional
	public void addTwoUsers(){
		Session session = sessionFactory.getCurrentSession();
		session.save(new User());
		//int i = 1 / 0;//此行会抛异常
		session.save(new User());
	}
}
