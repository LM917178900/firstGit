package org.framestudy.sm.usermag.service;

import org.framestudy.sm.beans.UserBean;

public interface IUserService {

	public int  insertUserBean(UserBean user);
	
	public int updateUserBean(UserBean user);
	
	public UserBean getUserBeanById(Long id);
}
