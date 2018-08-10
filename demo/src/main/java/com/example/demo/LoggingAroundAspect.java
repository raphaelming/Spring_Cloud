//package com.example.demo;
//
//import org.apache.juli.logging.Log;
//import org.apache.juli.logging.LogFactory;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDateTime;
//
//@Component
//@Aspect
//public class LoggingAroundAspect {
//    private Log log = LogFactory.getLog(getClass());
//
//    @Around("execution(* com.example.demo.CustomerService.*(..))")
//    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
//        LocalDateTime start = LocalDateTime.now();
//        Throwable toThrow = null;
//        Object returnValue = null;
//
//        try {
//            returnValue = joinPoint.proceed();
//        } catch (Throwable t) {
//            toThrow = t;
//        }
//
//        LocalDateTime stop = LocalDateTime.now();
//        log.info("Starting @ " + start.toString());
//        log.info("Finishing @ " + stop.toString() + " with duration " + stop.minusNanos(start.getNano()).getNano());
//
//        if (null != toThrow)
//            throw toThrow;
//
//        return returnValue;
//    }
//}
