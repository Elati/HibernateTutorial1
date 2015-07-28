package com.crud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_TB")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID;
	private String name;
	
	private int marks;
	/*
	private TIMESTAMP date;

	public TIMESTAMP getDate() {
		return date;
	}

	public void setDate(TIMESTAMP timestamp) {
		this.date = timestamp;
	}
*/
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
