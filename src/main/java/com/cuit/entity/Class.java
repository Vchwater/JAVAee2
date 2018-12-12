package com.cuit.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the class database table.
 * 
 */
@Entity
@Table(name = "class")
@NamedQuery(name="Class.findAll", query="SELECT c FROM Class c")
public class Class implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int classid;
	@Column
	private String classname;
	@Column
	private String college;
	@Column
	private String mojor;

	public Class() {
	}

	public int getClassid() {
		return this.classid;
	}

	public void setClassid(int classid) {
		this.classid = classid;
	}

	public String getClassname() {
		return this.classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getCollege() {
		return this.college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getMojor() {
		return this.mojor;
	}

	public void setMojor(String mojor) {
		this.mojor = mojor;
	}

}