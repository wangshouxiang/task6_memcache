package com.wangsx.task4_Tiles.model;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;


public class timeTag extends TagSupport {

	private static final long serialVersionUID = 1L;
	private Long time;
	public void setTime(Long time) {
		this.time = time;
	}
	
	
	@Override
	public int doEndTag() throws JspException {
		JspWriter out = pageContext.getOut();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if(time!=0) {
			Date date = new Date(time);
			String dateFormat = simpleDateFormat.format(date);
			try {
				out.print(dateFormat);
			} catch (IOException e) {
	
				e.printStackTrace();
			}
		}else {
			try {
				out.print("标签错误啦");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return super.doEndTag();
	}
	
}
