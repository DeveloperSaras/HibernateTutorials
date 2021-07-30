package com.sks;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Teacher")
public class Teacher {
	
	@Id
	private int id;
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
	public Teacher(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
