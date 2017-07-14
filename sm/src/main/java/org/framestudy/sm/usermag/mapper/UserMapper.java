package org.framestudy.sm.usermag.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.framestudy.sm.beans.UserBean;
//这是一个接口；
public interface UserMapper {

	@Insert("insert into t_user (user_name,login_name) values (#{user.userName},#{user.loginName})")
	public int insertUserBean(@Param("user")UserBean user);
	
	
	@Update("update t_user set user_name=#{user.userName},login_name=#{user.loginName} where id=#{user.id}")
	public int updateUserBean(@Param("user")UserBean user);
	
	//此处没有“”，
	@ResultType(UserBean.class)
	@Select("select id as id, user_name as userName,login_name as loginName from t_user where id=#{id}")
	public UserBean getUserBeanById(Long id);
}
