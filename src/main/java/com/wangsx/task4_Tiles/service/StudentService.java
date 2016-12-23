package com.wangsx.task4_Tiles.service;

import com.wangsx.task4_Tiles.model.Student;

public interface StudentService {
	public Student selectStudentById(int id);
	public Student selectStudentByPhone(long studentPhone);
	public void insertStudent(Student student);
	public int getTotalStudentCount();
	public void deleteStudentById(int id);
	public void updateStudentById(Student student);
	
}
