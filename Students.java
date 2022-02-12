package com.mondee;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="students")
public class Students {

	@Id
	@Column(name="studentid")
	private int studentId;

	@Column(name="studentname")
	private String studentName;

	@ManyToMany(fetch=FetchType.LAZY,targetEntity = Branch.class,cascade = CascadeType.ALL)
	@JoinColumn(name="branchid")
	private Set obj;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Set getObj() {
		return obj;
	}

	public void setObj(Set obj) {
		this.obj = obj;
	}

}