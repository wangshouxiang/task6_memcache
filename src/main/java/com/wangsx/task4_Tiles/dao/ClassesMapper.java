package com.wangsx.task4_Tiles.dao;

import org.apache.ibatis.annotations.*;
import com.wangsx.task4_Tiles.model.*;

public interface ClassesMapper {
	@Select("select id,class_id as classId,class_name as className,student_sum as studentSum,"
			+ "student_id as studentId,profession_id as professionId,class_qq as classQq,"
			+ "create_at as createAt,update_at as updateAt class_manifesto as classManifesto"
			+ " where id=#{id}")
	public Classes selectClassesById(int id);

	@Insert("insert into classes(class_id,class_name,student_sum,student_id,profession_id,"
			+ "class_qq,create_at,update_at,class_manifesto) "
			+ "values(#{classId},#{className},#{studentSum},#{studentId},"
			+ "#{professionId},#{classQq},#{createAt},#{updateAt},#{classManifesto})")
	@Options(useGeneratedKeys=true, keyProperty="id")
	public void insertClasses(Classes classes);
	
	@Select("select sum(student_sum) from classes where profession_id=#{professionId}")
	public int findLearningCount(int professionId);
}
