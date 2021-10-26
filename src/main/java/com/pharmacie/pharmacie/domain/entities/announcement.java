package com.pharmacie.pharmacie.domain.entities;

import java.sql.Blob;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class announcement {
	   @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    int announcementID;
	   
	   String title;
	   String Description;
	   
	   Blob picture;
	   Boolean valid;
	   
	   @OneToMany(targetEntity=admin.class, mappedBy="adminID", fetch=FetchType.EAGER)
	    List<Integer> adminID;
	   
	   

	public announcement() {
		super();
	}

	public announcement(int announcementID, String title, String description, Blob picture, Boolean valid,
			List<Integer> adminID) {
		super();
		this.announcementID = announcementID;
		this.title = title;
		Description = description;
		this.picture = picture;
		this.valid = valid;
		this.adminID = adminID;
	}

	public int getAnnouncementID() {
		return announcementID;
	}

	public void setAnnouncementID(int announcementID) {
		this.announcementID = announcementID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Blob getPicture() {
		return picture;
	}

	public void setPicture(Blob picture) {
		this.picture = picture;
	}

	public Boolean getValid() {
		return valid;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	public List<Integer> getAdminID() {
		return adminID;
	}

	public void setAdminID(List<Integer> adminID) {
		this.adminID = adminID;
	}
	   
}
