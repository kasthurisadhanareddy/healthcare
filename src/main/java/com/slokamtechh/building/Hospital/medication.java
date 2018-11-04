package com.slokamtechh.building.Hospital;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="medication")
public class medication {

	private Long id;
	private String howtoUse;
	private Integer quantity;
	private Integer duration;
	private medicine medicine;
	private complants comm;
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHowtoUse() {
		return howtoUse;
	}
	public void setHowtoUse(String howtoUse) {
		this.howtoUse = howtoUse;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	@ManyToOne
	@JoinColumn(name="fkmedicineid")
	public medicine getMedicine() {
		return medicine;
	}
	public void setMedicine(medicine medicine) {
		this.medicine = medicine;
	}
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cid")
	public complants getComm() {
		return comm;
	}
	public void setComm(complants comm) {
		this.comm = comm;
	}
	
}
