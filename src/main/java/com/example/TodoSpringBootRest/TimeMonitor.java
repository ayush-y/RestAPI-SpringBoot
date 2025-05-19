package com.example.TodoSpringBootRest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
/**
 * Custom annotation to monitor the execution time of methods.
 * This annotation can be used to mark methods for performance monitoring.
 */
public @interface TimeMonitor {


}
