package com.dionlan.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Person {

	@Id
	@EqualsAndHashCode.Include
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@NotBlank
	@Column(name = "last_name", nullable = false)
	private String lastName;
	
	@NotBlank
	@Column(nullable = false)
	private String address;
	
	@NotBlank
	@Column(nullable = false)
	private String gender;
	
	@NotBlank
	@Column(nullable = false)
	private Boolean enabled;
}