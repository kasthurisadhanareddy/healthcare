package com.slokamtechh.building.Hospital;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="visiting")
public class visiting {

	private Long id;
	private Date dateTime;
	private appointment app;
	private doctor doc;
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	@OneToOne
	@JoinColumn(name="fkapid")
	public appointment getApp() {
		return app;
	}
	public void setApp(appointment app) {
		this.app = app;
	}
	
	@ManyToOne
	@JoinColumn(name="fkdid")
	public doctor getDoc() {
		return doc;
	}
	public void setDoc(doctor doc) {
		this.doc = doc;
	}
	
	
}
