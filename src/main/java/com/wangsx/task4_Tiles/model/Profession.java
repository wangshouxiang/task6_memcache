package com.wangsx.task4_Tiles.model;

import java.io.Serializable;

public class Profession implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int professionId;
	private String professionName;
	private long createAt;
	private long updateAt;
	private String professionCategory;
	private String descProfession;
	private String growthCycle;
	private int company;
	private String precondition;
	
	public String getProfessionCategory() {
		return professionCategory;
	}
	public void setProfessionCategory(String professionCategory) {
		this.professionCategory = professionCategory;
	}
	public String getDescProfession() {
		return descProfession;
	}
	public void setDescProfession(String descProfession) {
		this.descProfession = descProfession;
	}
	public String getGrowthCycle() {
		return growthCycle;
	}
	public void setGrowthCycle(String growthCycle) {
		this.growthCycle = growthCycle;
	}
	public int getCompany() {
		return company;
	}
	public void setCompany(int company) {
		this.company = company;
	}
	public String getPrecondition() {
		return precondition;
	}
	public void setPrecondition(String precondition) {
		this.precondition = precondition;
	}
	public int getProfessionId() {
		return professionId;
	}
	public void setProfessionId(int professionId) {
		this.professionId = professionId;
	}
	public String getProfessionName() {
		return professionName;
	}
	public void setProfessionName(String professionName) {
		this.professionName = professionName;
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
	
}
