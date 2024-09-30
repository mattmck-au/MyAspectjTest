package mattmck.testapp;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TestAspect2 {
	
	// https://stackoverflow.com/questions/66440606/how-to-make-an-aspectj-aspect-work-in-a-gradle-project

	
	
	@Before("execution(* mattmck.test.Customer.*(..))")
	public void logBeforeAllMethods(JoinPoint joinPoint) {
      System.out.println("POINTCUT");
   }  
	

}
