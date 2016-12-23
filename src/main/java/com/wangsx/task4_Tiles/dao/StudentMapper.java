package com.wangsx.task4_Tiles.dao;

import org.apache.ibatis.annotations.*;
import com.wangsx.task4_Tiles.model.*;

public interface StudentMapper {
	@Select("select id,student_id as studentId,student_name as studentName,"
			+ "student_age as studentAge,student_manifesto as StudentManifesto,"
			+ "student_qq as studentQq,create_at as createAt, update_at as updateAt,"
			+ "student_iphone as studentIphone,student_password as studentPassword "
			+ "from student where id=#{id}")
	public Student selectStudentById(int id);
	
	@Select("select max(id)  from student")
	public int getTotalStudentCount();
	
	@Select("select id,student_id as studentId,student_name as studentName,"
			+ "student_age as studentAge,student_manifesto as StudentManifesto,"
			+ "student_qq as studentQq,create_at as createAt, update_at as updateAt,"
			+ "student_iphone as studentIphone,student_password as studentPassword "
			+ "from student where student_iphone=#{studentPhone}")
	public Student selectStudentByPhone(Long studentPhone);
	
	@Insert("insert into student(student_name,student_age,student_manifesto,"
			+ "student_qq,create_at,update_at,student_id,student_iphone,student_password)"
			+  "values(#{studentName},#{studentAge},#{studentManifesto},"
			+ "#{studentQq},#{createAt},#{updateAt},#{studentId},#{studentIphone},#{studentPassword})")
	@Options(useGeneratedKeys=true, keyProperty="id")
	public void insertStudent(Student student);
	
	@Delete("delete from student where student_id=#{id}")
	public void deleteStudentById(int id);
	
	@Update("update student set student_name=#{studentName},student_age=#{studentAge},"
			+ "student_manifesto=#{studentManifesto},student_qq=#{studentQq},update_at=#{updateAt},"
			+ "where student_id=#{studentId}")
	public void updateStudentById(Student student);
}
