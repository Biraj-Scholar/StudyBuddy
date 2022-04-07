package com.example.demo;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static javax.persistence.FetchType.EAGER;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
	
	//Auto Generated
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	// Personal Info
	private String fName;
	private String lName;
	
	// Contact Info
	private String mobileNumber;
	private String alternateMobileNumber;
	
	// Credentials : Email Id used as userID
	private String userId;
	private String userPassword;

	@ManyToMany(fetch = EAGER)
	private Collection<Role> roles = new ArrayList<>();	
	
	// Display Name 
	private String userName;
	
	//private Collection<LearningBlocker> userBlocker = new ArrayList<>();
}
