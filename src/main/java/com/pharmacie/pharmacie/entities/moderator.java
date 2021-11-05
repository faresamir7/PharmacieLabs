package com.pharmacie.pharmacie.entities;

import javax.persistence.Entity;

@Entity
public class moderator extends user {


	public moderator() {
	}

	public moderator(Long moderatorID, String username, String passwd) {
		super(moderatorID, username, passwd, true, "MOD");
	}

}
