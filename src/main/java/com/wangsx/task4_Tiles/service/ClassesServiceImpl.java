package com.wangsx.task4_Tiles.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import com.wangsx.task4_Tiles.dao.*;
import com.wangsx.task4_Tiles.model.*;
import com.wangsx.task4_Tiles.util.MemcachedKeyUtil;

@Component
public class ClassesServiceImpl extends MemcachedSupport implements ClassesService {
	@Autowired
	ClassesMapper classesMapper;
	public Classes selectClassesById(int id) {
		Classes classes = null;
		String classesKey = MemcachedKeyUtil.getClassesKey(id);
		classes = (Classes)getDetailData(2, classesKey);
		if(classes == null) {
			classes = classesMapper.selectClassesById(id);
			if(classes !=null) {
				setDetailData(2, classesKey, classes);
				System.out.println("class缓存:" + classesKey +":" + getDetailData(2, classesKey));
			}
		}
		return classes;
	}

	@Override
	public void insertClasses(Classes classes) {
		classesMapper.insertClasses(classes);
		String classesKey = MemcachedKeyUtil.getClassesKey(classes.getClassId());
		setDetailData(2, classesKey, classes);
		System.out.println("class缓存:" + classesKey +":" + getDetailData(2, classesKey));
	}

	@Override
	public int findLearningCount(int professionId) {
		
		return classesMapper.findLearningCount(professionId);
	}

}
