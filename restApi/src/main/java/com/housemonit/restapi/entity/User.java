package com.housemonit.restapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	private Long id;
	private String name;
	private String surname;
	private String address;
}
