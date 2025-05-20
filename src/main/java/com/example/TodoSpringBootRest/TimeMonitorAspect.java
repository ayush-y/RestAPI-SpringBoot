package com.example.TodoSpringBootRest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeMonitorAspect {
    @Around("@annotation(TimeMonitor)")
    public void lofTime(ProceedingJoinPoint joinPoint) {
        System.out.println("TimeMonitorAspect: Logging time");
        long start = System.currentTimeMillis();
        // Proceed with the method execution
        try {
            // Execute the join point
            joinPoint.proceed();
        } catch (Throwable e) {
            System.out.println("Error during method execution: " + e.getMessage());
        }
        finally {
            long end = System.currentTimeMillis();
            System.out.println("Execution time: " + (end - start) + " ms");
        }
    }
}
