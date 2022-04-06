package com.example.demo;
// POJO Class for Blocker

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LearningBlocker {

	// Auto Generated
	private Long id;
	// Blocker Info
	private String title;
	private String details;

	// Blocker Meta Info
	private String creationDate;
	private String author;
	private String status;
	private String type;

	// Blocker Solution
	private String solution;
	
}
