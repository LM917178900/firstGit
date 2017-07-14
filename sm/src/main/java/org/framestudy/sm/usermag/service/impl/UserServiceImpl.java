package org.framestudy.sm.usermag.service.impl;

import javax.annotation.Resource;

import org.framestudy.sm.beans.UserBean;
import org.framestudy.sm.usermag.dao.IUserDao;
import org.framestudy.sm.usermag.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
//此处的问题是忘记了实现接口直接写了；方法；
//@Transactional(readOnly=true)
@Service
public class UserServiceImpl implements IUserService{

	@Resource
	private IUserDao userDaoImpl;
	
//	@Transactional(readOnly=false,isolation=Isolation.REPEATABLE_READ,rollbackFor=Exception.class,propagation=Propagation.REQUIRED)
	public int insertUserBean(UserBean user){
		
		return userDaoImpl.insertUserBean(user);
	}

	public int updateUserBean(UserBean user) {
		// TODO Auto-generated method stub
		return userDaoImpl.updateUserBean(user);
	}

	public UserBean getUserBeanById(Long id) {
		// TODO Auto-generated method stub
		return userDaoImpl.getUserBeanById(id);
	};
}
