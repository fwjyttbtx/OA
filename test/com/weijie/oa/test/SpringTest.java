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
		log.debug("����debug��Ϣ");
		log.info("����infp��Ϣ");
		log.warn("����warn��Ϣ");
		log.error("����error��Ϣ");
		log.fatal("����fatal��Ϣ");
	}
	
	//����SessionFactory
	@Test
	public void testSessionFactory() throws Exception {
		SessionFactory sessionFactory = (SessionFactory) ac.getBean("sessionFactory");
		System.out.println(sessionFactory);
	}
	
	//����transaction
	@Test
	public void testTransaction() throws Exception {
		//ע�ⲻ��new��TestService��Ҫ�õ������е�TestService
		TestService testService = (TestService) ac.getBean("testService");
		testService.addTwoUsers();
	}
}
