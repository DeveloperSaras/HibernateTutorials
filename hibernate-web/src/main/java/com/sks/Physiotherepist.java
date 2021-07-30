package com.sks;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("physiotherepistDoctor")
public class Physiotherepist extends Doctor{
	
	@Column(name="pay_per_hour")
	private int payPerHour;

	public int getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}

	public Physiotherepist(int id, String name, int payPerHour) {
		super(id, name);
		this.payPerHour = payPerHour;
	}

	

	
	
	
	

}
