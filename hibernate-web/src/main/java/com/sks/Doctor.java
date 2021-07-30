package com.sks;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "doctor11")

  @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
  
  @DiscriminatorColumn(name="type", discriminatorType =
  DiscriminatorType.STRING)
  
  @DiscriminatorValue(value="NormalDoctor")
 
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "doc_id")
	private int id;
	
	
	@Column(name = "name")
	private String name;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Doctor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	 

}
