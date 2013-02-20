/**
 * 
 */
package com.test.action;



import com.opensymphony.xwork2.ActionSupport;
import com.test.model.User;
import com.test.service.UserService;

public class UserAction extends ActionSupport{
	private UserService userService;
	private User user;
	private static final long serialVersionUID = 1L;
	
	
	public String register(){
		if(user != null && user.getUserName() != null &&  user.getUserPass() != null){
			this.userService.register(user);
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	public String login(){
		if(user != null && user.getUserName() != null &&  user.getUserPass() != null){
			if(this.userService.verifyUser(user)){
				return SUCCESS;
			}
		}
		return ERROR;
	}
	

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
