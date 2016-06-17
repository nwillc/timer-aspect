package com.github.nwillc.timeraspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class MethodTiming {
    private static final Logger LOGGER = Logger.getLogger(MethodTiming.class.getName());

    @Around("execution(@TimedMethod * *(..))")
    public Object timed(ProceedingJoinPoint pjp) throws Throwable {
        final long startTimeMillis = System.currentTimeMillis();
        try {
            return pjp.proceed();
        } finally {
            final long endTimeMillis = System.currentTimeMillis();
            LOGGER.info("> " + (endTimeMillis - startTimeMillis) + " ms " +
                    "spent in [" + Thread.currentThread().getName() + "] " +
                    pjp.getTarget().getClass().getName() + "." +
                    pjp.getSignature().getName() + "()"
            );
        }
    }
}
