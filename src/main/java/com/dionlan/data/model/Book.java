package com.dionlan.data.model;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Column(nullable = false)
	private String author;
	
	@Column(name = "launch_date", nullable = false)
	private OffsetDateTime launchDate;
	
	@NotNull
	@PositiveOrZero
	@Column(nullable = false)
	private BigDecimal price;
	
	@NotBlank
	@Column(nullable = false)
	private String title;
}