package com.cuit.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the schooltime database table.
 * 
 */
@Entity
@Table(name = "schooltime")
@NamedQuery(name="Schooltime.findAll", query="SELECT s FROM Schooltime s")
public class Schooltime implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int schooltimeid;
	@Column
	private String classaddr;
	@Column
	private int classtime;
	@Column
	private int courseid;
	@Column
	private String introduce;

	public Schooltime() {
	}

	public int getSchooltimeid() {
		return this.schooltimeid;
	}

	public void setSchooltimeid(int schooltimeid) {
		this.schooltimeid = schooltimeid;
	}

	public String getClassaddr() {
		return this.classaddr;
	}

	public void setClassaddr(String classaddr) {
		this.classaddr = classaddr;
	}

	public int getClasstime() {
		return this.classtime;
	}

	public void setClasstime(int classtime) {
		this.classtime = classtime;
	}

	public int getCourseid() {
		return this.courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getIntroduce() {
		return this.introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

}