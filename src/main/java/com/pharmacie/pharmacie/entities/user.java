package com.pharmacie.pharmacie.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class user {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String username;
	String passwd;
	boolean enabled;
	String role;

	public user() {
	}

	public user(Long id, String username, String passwd, boolean enabled, String role) {
		this.id = id;
		this.username = username;
		this.passwd = passwd;
		this.enabled = enabled;
		this.role = role;

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}
