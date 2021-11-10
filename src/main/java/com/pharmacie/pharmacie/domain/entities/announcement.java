package com.pharmacie.pharmacie.domain.entities;

import java.sql.Blob;
import java.util.List;

import javax.persistence.Basic;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long announcementID;
	
	
	String title;
	String Description;

	Blob picture;
	Boolean valid;

	@Basic
	private java.sql.Date announcementDate;

	@OneToMany(targetEntity = admin.class, mappedBy = "adminID", fetch = FetchType.EAGER)
	List<Integer> adminID;

	public announcement() {
		super();
	}

	public announcement(long announcementID, String title, String description, Blob picture, Boolean valid,
			List<Integer> adminID) {
		super();
		this.announcementID = announcementID;
		this.title = title;
		Description = description;
		this.picture = picture;
		this.valid = valid;
		this.adminID = adminID;
	}

	public java.sql.Date getAnnouncementDate() {
		return announcementDate;
	}

	public void setAnnouncementDate(java.sql.Date announcementDate) {
		this.announcementDate = announcementDate;
	}

	public long getAnnouncementID() {
		return announcementID;
	}

	public void setAnnouncementID(long announcementID) {
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
