package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Relic {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	
	private String image;
	private String name;
	private String museum;
	private String period;
	private String excavation;
	private String note;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMuseum() {
		return museum;
	}
	public void setMuseum(String museum) {
		this.museum = museum;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getExcavation() {
		return excavation;
	}
	public void setExcavation(String excavation) {
		this.excavation = excavation;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	@Override
	public String toString() {
		return "Relic [id=" + id + ", image=" + image + ", name=" + name + ", museum=" + museum + ", period=" + period
				+ ", excavation=" + excavation + ", note=" + note + "]";
	}
	

}
