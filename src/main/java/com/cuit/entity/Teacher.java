package com.cuit.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the teacher database table.
 * 
 */
@Entity
@Table(name = "teacher")
@NamedQuery(name="Teacher.findAll", query="SELECT t FROM Teacher t")
public class Teacher implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int teacherid;
	@Column
	private int invigilate;
	@Column
	private String name;
	@Column
	private String position;

	public Teacher() {
	}

	public int getTeacherid() {
		return this.teacherid;
	}

	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}

	public int getInvigilate() {
		return this.invigilate;
	}

	public void setInvigilate(int invigilate) {
		this.invigilate = invigilate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}