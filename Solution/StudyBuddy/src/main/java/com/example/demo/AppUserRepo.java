package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Basic CRUD operations
@Repository
public interface AppUserRepo extends JpaRepository<AppUser, Long>{
	AppUser findByUsername(String username);
}
