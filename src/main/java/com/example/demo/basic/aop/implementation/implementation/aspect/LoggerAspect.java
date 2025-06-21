package com.example.demo.basic.aop.implementation.implementation.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggerAspect {
    private Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution(* com.example.demo.basic.aop.implementation.implementation.services.*.*(..))")
    public void log(ProceedingJoinPoint jointPoint) throws Throwable {
        logger.info(jointPoint.getSignature().toString() + "method execution start");
        Instant start = Instant.now();
        jointPoint.proceed();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method: " + timeElapsed);
        logger.info(jointPoint.getSignature().toString() + " method execution end");
    }
}
