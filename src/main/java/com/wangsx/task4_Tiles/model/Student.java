package com.wangsx.task4_Tiles.model;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String studentName;
	private int studentAge;
	private String studentManifesto;
	private long studentQq;
	private long createAt;
	private long updateAt;
	private int studentId;
	private long studentIphone;
	private String studentPassword;
	
	public long getStudentIphone() {
		return studentIphone;
	}
	public void setStudentIphone(long studentIphone) {
		this.studentIphone = studentIphone;
	}
	public String getStudentPassword() {
		return studentPassword;
	}
	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentManifesto() {
		return studentManifesto;
	}
	public void setStudentManifesto(String studentManifesto) {
		this.studentManifesto = studentManifesto;
	}
	public long getStudentQq() {
		return studentQq;
	}
	public void setStudentQq(long studentQq) {
		this.studentQq = studentQq;
	}
	public long getCreateAt() {
		return createAt;
	}
	public void setCreateAt(long createAt) {
		this.createAt = createAt;
	}
	public long getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(long updateAt) {
		this.updateAt = updateAt;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	
}
