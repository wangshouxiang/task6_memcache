package com.wangsx.task4_Tiles.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;

import com.danga.MemCached.MemCachedClient;


@Controller
@RequestMapping(value="/memcache")
public class MemcacheController {
	
	@Autowired
	MemCachedClient mc;
	@RequestMapping("/test")
	public void MemcacheTest( ) {
		/*ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		MemCachedClient mc = (MemCachedClient)context.getBean("memCachedClient");
		MemCachedClient mc = new MemCachedClient("memCachedPool");*/
		mc.set("name", "wangsx1112222");
		mc.set("profession", "student1112222");
		mc.set("wangsx", "wangsx");
		System.out.println(mc.get("name"));
		System.out.println(mc.get("profession"));
		System.out.println(mc.get("wangsx"));
	}
}
