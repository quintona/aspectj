package org.example.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Aspect
public class MainAspect {

	@Before("execution(* *.*.main(..))")
	public void someMainBefore(JoinPoint jp) throws Throwable {
		System.out.println("I am an aspect!");
	}

}
