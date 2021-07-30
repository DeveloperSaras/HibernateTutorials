package com.sks.subclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "physiotherepist31")
@PrimaryKeyJoinColumn(name = "id")
public class Physiotherepist extends Doctor {
	
	
	@Column(name = "pay_per_hour")
	private int payPerHour;

	public int getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}
	
}
