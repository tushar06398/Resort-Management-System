package com.resort.solution.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "resortAmenities")
public class ResortAmenity {
	
	@ManyToOne
	@JoinColumn(name = "resort_id")
	private Resort resort;
	
	@ManyToOne
	@JoinColumn(name = "amenity_id")
	private Amenity amenity;
}

//resortId
//amenityId
