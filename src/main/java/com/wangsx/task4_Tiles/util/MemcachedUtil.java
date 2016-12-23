package com.wangsx.task4_Tiles.util;

import com.danga.MemCached.MemCachedClient;
import com.danga.MemCached.SockIOPool;

public class MemcachedUtil {
	 
	private int MEMCACHED_SERVER_NUM = 4;  
    private SockIOPool[] pools = new SockIOPool[MEMCACHED_SERVER_NUM];  
    private MemCachedClient[] mcs = new MemCachedClient[MEMCACHED_SERVER_NUM];  
    private final String[] poolNames = new String[] { "STUDENT_POOL", "PROFESSION_POOL", "CLASSES_POOL", "OTHER_POOL" };  
    
    private static MemcachedUtil instance;  
    private MemcachedUtil() {  
        this.init();  
    }  
    // 单例  
    public static MemcachedUtil getInstance() {  
        if (MemcachedUtil.instance == null) {  
            synchronized (MemcachedUtil.class) {  
                if (MemcachedUtil.instance == null) {  
                    MemcachedUtil.instance = new MemcachedUtil();  
                }  
            }  
        }  
        return MemcachedUtil.instance;  
    }  
      
    public Object get(int index, String key) {  
        return this.mcs[index].get(key);  
    }  
      
    public boolean set(int index, String key, Object value) {  
        return this.mcs[index].set(key, value);  
    }  
      
    public boolean delete(int index, String key) {  
        return this.mcs[index].delete(key);  
    }  
    public MemCachedClient getMemCachedClient(int index) {  
        return this.mcs[index];  
    }  
    
    //服务器列表及其权重  
    String[] servers = {"127.0.0.1:11211"};  
    Integer[] weights = {3};  
    public void init() {  
        for (int i = 0; i < MEMCACHED_SERVER_NUM; ++i) {  
            this.pools[i] = SockIOPool.getInstance(poolNames[i]);  
            this.pools[i].setServers(servers);  
            this.pools[i].setWeights(weights);  
            this.pools[i].setInitConn(10);  
            this.pools[i].setMinConn(10);  
            this.pools[i].setMaxConn(1000);  
            this.pools[i].setMaxIdle(1000*60*60);   
            this.pools[i].setMaintSleep(60);  
            this.pools[i].setNagle(false);  
            this.pools[i].setSocketTO(60);  
            this.pools[i].setSocketConnectTO(0);  
            this.pools[i].initialize();  
            this.mcs[i] = new MemCachedClient(poolNames[i]);  
        }  
    }  
}
