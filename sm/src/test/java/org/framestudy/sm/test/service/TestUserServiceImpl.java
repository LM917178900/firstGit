package org.framestudy.sm.test.service;
import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.framestudy.sm.beans.UserBean;
import org.framestudy.sm.usermag.service.IUserService;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class TestUserServiceImpl {

	@Resource
	private IUserService userServiceImpl;
	@Ignore
	public void testInsertUserBean(){
		UserBean user=new UserBean(null, "lixunhuan", "xiaolifeidao");
		int rows=userServiceImpl.insertUserBean(user);
		Assert.assertEquals(1, rows);
		
	};
	
	@Ignore
	public void testUpateUserBean(){
		
		UserBean user=new UserBean(2l, "leishen", "leishen");		
		int rows=userServiceImpl.updateUserBean(user);
		Assert.assertEquals(1, rows);
	};
	@Test
	public void testGetUserBeanById(){
		UserBean user=userServiceImpl.getUserBeanById(3l);
		System.out.println(user);
	}
	
	
}
