package com.dionlan.data.vo.v1;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.github.dozermapper.core.Mapping;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@JsonPropertyOrder({ "id", "author", "launchDate", "price", "title" })
@Data
public class BookVO extends RepresentationModel<BookVO>{

	@Mapping("id")
	@JsonProperty("id")
	private Long key;
	private String author;
	private OffsetDateTime launchDate;
	private BigDecimal price;
	private String title;
}