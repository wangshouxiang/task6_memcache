package com.wangsx.task4_Tiles.service;

import com.wangsx.task4_Tiles.model.*;

public interface ProfessionService {
	
	public Profession selectProfessionById(int id);
	public void insertProfession(Profession profession);
	public void deleteProfessionById(int id);
	public void updateProfessionById(Profession profession);
}
