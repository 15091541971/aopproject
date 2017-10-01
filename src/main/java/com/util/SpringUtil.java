package com.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringUtil implements ApplicationContextAware{
     private static ApplicationContext arg0;
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		this.arg0=arg0;
	}
	
	public static  Object getBeanByname(String name){
	Object t=arg0.getBean(name);
		return t;
		
	}

}
