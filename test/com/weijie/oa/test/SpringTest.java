package com.weijie.oa.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	private Log log = LogFactory.getLog(getClass());
	
	@Test
	public void test(){
		log.debug("这是debug信息");
		log.info("这是infp信息");
		log.warn("这是warn信息");
		log.error("这是error信息");
		log.fatal("这是fatal信息");
	}
	
	//测试SessionFactory
	@Test
	public void testSessionFactory() throws Exception {
		SessionFactory sessionFactory = (SessionFactory) ac.getBean("sessionFactory");
		System.out.println(sessionFactory);
	}
	
	//测试transaction
	@Test
	public void testTransaction() throws Exception {
		//注意不能new出TestService需要拿到容器中的TestService
		TestService testService = (TestService) ac.getBean("testService");
		testService.addTwoUsers();
	}
}
