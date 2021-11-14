package com.takakaProducer.takakaProducer.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "user_ind")
public class UserInd {
	
	private String userId;
	private LocalDate date_hour;
	private String firstName;
	private String lastName;
	private String email;
	private String userPassword;
	private int nivel;

	public UserInd() {}

	public UserInd(String userId, LocalDate date_hour, String firstName, String lastName, String email,
			String userPassword, int nivel) {
		
		this.userId = userId;
		this.date_hour = date_hour;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userPassword = userPassword;
		this.nivel = nivel;
	}
	
	@Id
	@Column(name = "userId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userId_SEQ")
	@SequenceGenerator(name = "userId_SEQ", sequenceName = "userId_SEQ", allocationSize = 1)
	@ApiModelProperty(value = "ID do user")
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "date_hour")
	@ApiModelProperty(value = "Data de cadastro")
	public LocalDate getDate_hour() {
		return date_hour;
	}

	public void setDate_hour(LocalDate date_hour) {
		this.date_hour = date_hour;
	}

	@Column(name = "firstName")
	@ApiModelProperty(value = "Primeiro nome")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "lastName")
	@ApiModelProperty(value = "Sobrenome")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "email")
	@ApiModelProperty(value = "Email do user")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "userPassword")
	@ApiModelProperty(value = "Senha do user")
	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	@Column(name = "userPassword")
	@ApiModelProperty(value = "nivel de acesso")
	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	
	
	
}
