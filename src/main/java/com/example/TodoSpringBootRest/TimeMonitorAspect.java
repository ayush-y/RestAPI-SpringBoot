package com.example.TodoSpringBootRest;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeMonitorAspect {
    @Around("@annotation(TimeMonitor)")
    public void lofTime(){
        System.out.println("TimeMonitorAspect: Logging time");
    }
}
