package com.sks.subclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "cardiologist31")
@PrimaryKeyJoinColumn(name = "id")
public class Cardiologist extends Doctor {
	
	
	@Column(name = "salary")
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
