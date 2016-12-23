package com.wangsx.task4_Tiles.service;

import com.wangsx.task4_Tiles.model.*;

public interface ClassesService {
	public Classes selectClassesById(int id);
	public void insertClasses(Classes classes);
	public int findLearningCount(int professionId);
}
