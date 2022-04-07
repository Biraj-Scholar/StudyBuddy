package com.example.demo;

import java.util.List;

public interface AppUserService {
	
	AppUser saveUser(AppUser user);
	Role saveRole(Role role);
	void addRoleToUser(String userName, String roleName);
	AppUser getUser(String userName);
	List<AppUser> getAllUser();

}
