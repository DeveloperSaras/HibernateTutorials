package com.sks;

public class Doctor {
	
	private int docId;
	private String name;
	private String department;
	
	
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int docId, String name, String department) {
		super();
		this.docId = docId;
		this.name = name;
		this.department = department;
	}
	
	
	
	
	
	

}
