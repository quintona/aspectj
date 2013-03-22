package org.example.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Aspect
public class LogAnimalNameAspect {

	private static final Logger log = LoggerFactory.getLogger(LogAnimalNameAspect.class);

	@Pointcut("execution(* org.example.aspectj.domain.Animalia+.getName())") // expression
	private void animalName() {}  // signature

	@Around(value = "animalName()")
	public Object animalName(ProceedingJoinPoint pjp1) throws Throwable {

		Object ret = null;

		try {
			ret = pjp1.proceed();
		} finally {
			log.info("Aspect -> " + ret);
		}
		return ret;
	}

}
