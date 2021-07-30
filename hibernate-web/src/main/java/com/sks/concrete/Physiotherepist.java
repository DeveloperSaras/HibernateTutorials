package com.sks.concrete;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="phyisotherepist21")
@AttributeOverrides({
	@AttributeOverride(name="id", column=@Column(name = "id")),
	@AttributeOverride(name="name", column=@Column(name = "name"))
	
})
public class Physiotherepist extends Doctor{
	
	@Column(name = "pay_per_hour")
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
