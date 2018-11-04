

package com.slokamtechh.building.Hospital;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="complants")
public class complants {

	private Long id;
	private String decription;
	private List<disease> dis;
	private visiting visi;
	
	private List<medication> med;
	@OneToMany(mappedBy="comm",cascade=CascadeType.ALL)
	public List<medication> getMed() {
		return med;
	}
	public void setMed(List<medication> med) {
		this.med = med;
	}
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	@ManyToMany
	@JoinTable(
			name="complants_disease",
			joinColumns= {@JoinColumn(name="fkcid")},
			inverseJoinColumns= {@JoinColumn(name="fkdeid")}
			)
	public List<disease> getDis() {
		return dis;
	}
	public void setDis(List<disease> dis) {
		this.dis = dis;
	}
	@ManyToOne
	@JoinColumn(name="fkvid")
	public visiting getVisi() {
		return visi;
	}
	public void setVisi(visiting visi) {
		this.visi = visi;
	}
	
	
}
