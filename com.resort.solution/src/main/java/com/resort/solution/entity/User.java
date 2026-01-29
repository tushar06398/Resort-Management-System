package com.resort.solution.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.resort.solution.enums.UserStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@NoArgsConstructor
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Integer userId;
	
	@Setter
	@Column(name="user_name",nullable = false)
	private String name;
	
	@Setter
	@Column(name="email",nullable = false , unique = true)
	private String email;
	
	@Setter
	@Column(name="password",nullable = false)
	private String password;
	
	@Setter
	@Column(name="phone",nullable = false)
	private String phone;
	
	@Setter
	@Column(name="status" , nullable = false)
	private UserStatus status;
	
	@CreationTimestamp
	@Column(name="creation_time")
	private LocalDateTime createdAt = LocalDateTime.now();
}


//userId
//name
//email
//password
//phone
//status
//createdAt
