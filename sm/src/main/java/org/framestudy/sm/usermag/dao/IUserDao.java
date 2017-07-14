package org.framestudy.sm.usermag.dao;

import org.framestudy.sm.beans.UserBean;

public interface IUserDao {

	public int  insertUserBean(UserBean user);
	
	public int updateUserBean(UserBean user);
	
	public UserBean getUserBeanById(Long id);
}
