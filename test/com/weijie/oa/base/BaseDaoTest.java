package com.weijie.oa.base;

import org.junit.Test;

import com.weijie.oa.dao.RoleDao;
import com.weijie.oa.dao.UserDao;
import com.weijie.oa.dao.impl.RoleDaoImpl;
import com.weijie.oa.dao.impl.UserDaoImpl;

public class BaseDaoTest {

	@Test
	public void testGetById() {
		UserDao userDao = new UserDaoImpl();
		RoleDao roleDao = new RoleDaoImpl();
		
		userDao.getById(1L);
		roleDao.getById(1L);
	}

}
