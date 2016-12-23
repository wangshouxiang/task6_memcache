package com.wangsx.task4_Tiles.service;

import com.wangsx.task4_Tiles.util.MemcachedUtil;

public class MemcachedSupport {
	public boolean setDetailData(int index,String key, Object value) {  
        return MemcachedUtil.getInstance().set(index, key, value);  
    }  
      
    public Object getDetailData(int index, String key) {  
        return MemcachedUtil.getInstance().get(index, key);  
    }  
      
    public boolean deleteDetailData(int index, String key) {  
        return MemcachedUtil.getInstance().delete(index, key);  
    }  
}
