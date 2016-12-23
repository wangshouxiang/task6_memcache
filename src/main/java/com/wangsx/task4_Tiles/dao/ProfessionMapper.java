package com.wangsx.task4_Tiles.dao;

import org.apache.ibatis.annotations.*;
import com.wangsx.task4_Tiles.model.*;

public interface ProfessionMapper {
	@Select("select profession_id as professionId,profession_name as professionName,create_at as createAt,"
			+ "update_at as updateAt,profession_category as professionCategory,desc_profession as descProfession,"
			+ "growth_cycle as growthCycle,company,precondition from profession where profession_id=#{id}")
	public Profession selectProfessionById(int id);

	@Insert("insert into profession(profession_name,create_at,update_at,professionCategory,descProfession,growthCycle,company,precondition) "
			+ "values(#{professionName},#{createAt},#{updateAt},#{professionCategory},#{descProfession},#{growthCycle},#{company},#{precondition})")
	@Options(useGeneratedKeys=true, keyProperty="professionId")
	public void insertProfession(Profession profession);
	
	@Delete("delete from profession where profession_id=#{id}")
	public void deleteProfessionById(int id);
	
	@Update("update profession set profession_name=#{professionName},update_at=#{updateAt},profession_category=#{professionCategory},desc_profession=#{descProfession},"
			+ "growth_cycle=#{growthCycle},company=#{company},precondition=#{precondition} where profession_id=#{professionId}")
	public void updateProfessionById(Profession profession);
}
