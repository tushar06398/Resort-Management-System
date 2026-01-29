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
@Table(name = "amenity")
public class Amenity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "amenity_id")
	private Long amenityId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;

}

//amenityId
//name
//description
