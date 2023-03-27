package com.khadri.hibernate.entities2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Test2")
public class Test {
 
	@Id
	private Long id;
	
	private String orderName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
}
