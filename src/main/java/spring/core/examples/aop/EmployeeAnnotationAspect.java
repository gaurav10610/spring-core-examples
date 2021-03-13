package spring.core.examples.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAnnotationAspect {

  @Before("@annotation(spring.core.examples.aop.Loggable)")
  public void myAdvice() {
    System.out.println("Executing myAdvice!!");
  }
}
