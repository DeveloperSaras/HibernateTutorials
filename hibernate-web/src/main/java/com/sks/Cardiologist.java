package com.sks;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("caridologistDoctor")
public class Cardiologist extends Doctor {

	@Column(name="salary")
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Cardiologist(int id, String name, int salary) {
		super(id, name);
		this.salary = salary;
	}
	
	
	
	
}
