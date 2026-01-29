package com.resort.solution.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "cities")
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "city_id")
	private Integer cityId;
	
	@Column(name = "city_name")
	private String cityName;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "country")
	private String country;

}


//cityId
//cityName
//state
//country
