package com.cuit.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the student database table.
 * 
 */
@Entity
@Table(name = "student")
@NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentid;

	@Column
	private String classid;
	@Column
	private String name;

	public Student() {
	}

	public int getStudentid() {
		return this.studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getClassid() {
		return classid;
	}

	public void setClassid(String classid) {
		this.classid = classid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}