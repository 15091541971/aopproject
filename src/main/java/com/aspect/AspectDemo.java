package com.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class AspectDemo {
@After("execution(* f(**))")	
public void aspect(){
	System.out.println("执行了前置增强");
}
}
