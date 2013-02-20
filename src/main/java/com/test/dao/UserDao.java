/**
 * 
 */
package com.test.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.test.model.User;

public class UserDao {
	private Map<String, String> seesionMap = new HashMap<String, String>();
	
	
	
	public void register(User user){
		this.seesionMap.put(user.getUserName(), user.getUserPass());
		Set<String> keySet = seesionMap.keySet();
		int i = 0;
		for(String key : keySet ){
			System.out.println("用户 "+(++i)+" : 用户名="+key + " 密码="+seesionMap.get(key));
			System.out.println("-------------------------------------------------------");
		}
	}
	
	public boolean verifyUser(User user){
		return user.getUserPass().equals(this.seesionMap.get(user.getUserName()));
	}

}
