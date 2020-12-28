package com.Cloud.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Counter {

	@Id
	private Long id;
	
	@Column
	private Integer brojac = 0;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getBrojac() {
		return brojac;
	}

	public void setBrojac(Integer brojac) {
		this.brojac = brojac;
	}
	
	
	
}
