package com.resort.solution.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "resorts")
public class Resort {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "resort_id")
	private Long resortId;
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "location_id")
	private Location location;
	
	@Column(name = "rating")
	private Double rating;
	
	@Column(name = "base_price")
	private BigDecimal basePrice;
	
	
	private Boolean isActive = true;
}

//resortId
//name
//description 
//locationId
//rating
//ecoScore
//basePrice
//isActive
