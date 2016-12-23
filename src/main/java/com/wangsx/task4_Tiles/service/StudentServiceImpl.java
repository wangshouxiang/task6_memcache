package com.wangsx.task4_Tiles.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import com.wangsx.task4_Tiles.dao.*;
import com.wangsx.task4_Tiles.model.Student;
import com.wangsx.task4_Tiles.util.MemcachedKeyUtil;

@Component
public class StudentServiceImpl extends MemcachedSupport implements StudentService {
	@Autowired
    StudentMapper studentMapper;
	
	public Student selectStudentById(int id) {
		Student student = null;
		String studentKey = MemcachedKeyUtil.getStudentsKey(id);
		student = (Student)getDetailData(0, studentKey);
		if(student == null) {
			student = studentMapper.selectStudentById(id);
			if(student != null) {
				setDetailData(0, studentKey, student);
				System.out.println("huancun-----------------"+studentKey+ getDetailData(0, studentKey) + "-----------------");
			}
		}
		return student;
	}

	@Override
	public void insertStudent(Student student) {
		
		studentMapper.insertStudent(student);
		String studentKey = MemcachedKeyUtil.getStudentsKey(student.getId());
		setDetailData(0, studentKey, student);
		System.out.println("huancun-----------------"+ studentKey+ getDetailData(0, studentKey) + "-----------------");
	}

	@Override
	public void deleteStudentById(int id) {
		studentMapper.deleteStudentById(id);
	}

	@Override
	public void updateStudentById(Student student) {
		studentMapper.updateStudentById(student);
	}

	@Override
	public int getTotalStudentCount() {
		
		return studentMapper.getTotalStudentCount();
	}

	@Override
	public Student selectStudentByPhone(long studentPhone) {
		
		/*return studentMapper.selectStudentByPhone(studentPhone);*/
		
		Student student = null;
		String studentKey = MemcachedKeyUtil.getStudentsKey(studentPhone);
		student = (Student)getDetailData(0, studentKey);
		if(student == null) {
			student = studentMapper.selectStudentByPhone(studentPhone);
			if(student != null) {
				setDetailData(0, studentKey, student);
				System.out.println("huancun-----------------" +studentKey+ getDetailData(0, studentKey) + "-----------------");
			}
		}
		return student;
	}

}
