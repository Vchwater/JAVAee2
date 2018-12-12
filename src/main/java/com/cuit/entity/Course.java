package com.cuit.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the course database table.
 * 
 */
@Entity
@Table(name = "Course")
@NamedQuery(name="Course.findAll", query="SELECT c FROM Course c")
public class Course implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int courseid;
	@Column
	private int classhour;
	@Column
	private String endtime;
	@Column
	private String name;
	@Column
	private String starttime;
	@Column
	private String teacher;

	public Course() {
	}

	public int getCourseid() {
		return this.courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public int getClasshour() {
		return this.classhour;
	}

	public void setClasshour(int classhour) {
		this.classhour = classhour;
	}

	public String getEndtime() {
		return this.endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStarttime() {
		return this.starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getTeacher() {
		return this.teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

}