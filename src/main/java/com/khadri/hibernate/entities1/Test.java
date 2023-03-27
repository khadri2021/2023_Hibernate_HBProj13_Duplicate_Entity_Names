package com.khadri.hibernate.entities1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Test1")// JPQL - java persistence query language
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
