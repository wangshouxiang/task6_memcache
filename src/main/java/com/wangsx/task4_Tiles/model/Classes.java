package com.wangsx.task4_Tiles.model;

import java.io.Serializable;


public class Classes implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int classId;
	private String className;
	private int studentSum;
	private int studentId;
	private int professionId;
	private long classQq;
	private long createAt;
	private long updateAt;
	private String classManifesto;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getStudentSum() {
		return studentSum;
	}
	public void setStudentSum(int studentSum) {
		this.studentSum = studentSum;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getProfessionId() {
		return professionId;
	}
	public void setProfessionId(int professionId) {
		this.professionId = professionId;
	}
	public long getClassQq() {
		return classQq;
	}
	public void setClassQq(long classQq) {
		this.classQq = classQq;
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
	public String getClassManifesto() {
		return classManifesto;
	}
	public void setClassManifesto(String classManifesto) {
		this.classManifesto = classManifesto;
	}
}












