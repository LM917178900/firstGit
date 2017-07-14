package org.framestudy.sm.usermag.dao.impl;

import javax.annotation.Resource;

import org.framestudy.sm.beans.UserBean;
import org.framestudy.sm.usermag.dao.IUserDao;
import org.framestudy.sm.usermag.mapper.UserMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {
	@Resource
	private UserMapper um;
	
	public int insertUserBean(UserBean user){
		return um.insertUserBean(user);
	}

	public int updateUserBean(UserBean user) {
		// TODO Auto-generated method stub
		return um.updateUserBean(user);
	}

	public UserBean getUserBeanById(Long id) {
		// TODO Auto-generated method stub
		return um.getUserBeanById(id);
	};
	
	
	

}
