package com.pharmacie.pharmacie.entities;

import javax.persistence.Entity;

@Entity
public class admin extends user {

	public admin(Long adminID, String username, String passwd) {
		super(adminID, username, passwd, true, "ADMIN");
	}

	public admin() {
	}

}
