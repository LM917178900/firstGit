package org.framestudy.sm.beans;

import java.io.Serializable;

public class UserBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String userName;
	private String loginName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", userName=" + userName + ", loginName=" + loginName + "]";
	}
	public UserBean(Long id, String userName, String loginName) {
		super();
		this.id = id;
		this.userName = userName;
		this.loginName = loginName;
	}
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
