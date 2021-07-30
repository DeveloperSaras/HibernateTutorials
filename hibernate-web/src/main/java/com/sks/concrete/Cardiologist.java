package com.sks.concrete;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity  
@Table(name="cardiologist21")  
@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="name", column=@Column(name="name"))  
})  
public class Cardiologist extends Doctor {
	
	@Column(name="salary")    
	private int salary;

	public Cardiologist(int id, String name, int salary) {
		super(id, name);
		this.salary = salary;
	}  
	  


}
