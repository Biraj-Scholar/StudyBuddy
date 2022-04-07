package com.example.demo;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



@Service @RequiredArgsConstructor @Transactional @Slf4j
public class AppUserServiceImp implements AppUserService {
	

	private final AppUserRepo userRepo;

	private final RoleRepo roleRepo;

	@Override
	public AppUser saveUser(AppUser user) {
		// TODO Auto-generated method stub
		log.info("Saving new user {} to the database",user.getUserName());
		return userRepo.save(user);
	}

	@Override
	public Role saveRole(Role role) {
		// TODO Auto-generated method stub

		return roleRepo.save(role);
	}

	@Override
	public void addRoleToUser(String userName, String roleName) {
		// TODO Auto-generated method stub
		AppUser user = userRepo.findByuserName(userName);
		Role role = roleRepo.findByName(roleName);
		user.getRoles().add(role);
	}

	@Override
	public AppUser getUser(String userName) {
		// TODO Auto-generated method stub
		return userRepo.findByuserName(userName);
	}

	@Override
	public List<AppUser> getAllUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

}

