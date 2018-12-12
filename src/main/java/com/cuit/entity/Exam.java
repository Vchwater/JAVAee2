package com.cuit.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the exam database table.
 * 
 */
@Entity
@Table(name = "exam")
@NamedQuery(name="Exam.findAll", query="SELECT e FROM Exam e")
public class Exam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int examid;
	@Column
	private String address;
	@Column
	private String date;
	@Column
	private String invigilator1;
	@Column
	private String invigilator2;
	@Column
	private String name;

	public Exam() {
	}

	public int getExamid() {
		return this.examid;
	}

	public void setExamid(int examid) {
		this.examid = examid;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getInvigilator1() {
		return this.invigilator1;
	}

	public void setInvigilator1(String invigilator1) {
		this.invigilator1 = invigilator1;
	}

	public String getInvigilator2() {
		return this.invigilator2;
	}

	public void setInvigilator2(String invigilator2) {
		this.invigilator2 = invigilator2;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}