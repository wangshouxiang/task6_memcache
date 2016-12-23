package com.wangsx.task4_Tiles.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.wangsx.task4_Tiles.dao.ProfessionMapper;
import com.wangsx.task4_Tiles.model.Profession;
import com.wangsx.task4_Tiles.util.MemcachedKeyUtil;

@Component
public class ProfessionServiceImpl extends MemcachedSupport implements ProfessionService {
   
	@Autowired
	ProfessionMapper professionMapper;
	
	@Override
	public void insertProfession(Profession profession) {
		
		professionMapper.insertProfession(profession);
		String professionKey = MemcachedKeyUtil.getProfessionKey(profession.getProfessionId());
		setDetailData(1, professionKey, profession);
		System.out.println("缓存:" + professionKey +":" + getDetailData(1, professionKey));
	}
	@Override
	public Profession selectProfessionById(int id) {
		
		Profession profession = null;
		String professionKey = MemcachedKeyUtil.getProfessionKey(id);
		profession = (Profession)getDetailData(1, professionKey);
		if(profession == null) {
			profession = professionMapper.selectProfessionById(id);
			if(profession != null) {
				setDetailData(1, professionKey, profession);
				System.out.println("缓存:" + professionKey +":" + getDetailData(1, professionKey));
			}
		}
		return profession;
	}

	@Override
	public void deleteProfessionById(int id) {
		professionMapper.deleteProfessionById(id);
	}

	@Override
	public void updateProfessionById(Profession profession) {
		professionMapper.updateProfessionById(profession);
	}

}
