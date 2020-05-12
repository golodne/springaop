package ru.example.springaop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class Audit {
    // До перевода средств
    @Before(value = "execution(* ru.example.springaop.SomeService.*(..)) and args(branchId)")
    public void beforeAdvice(JoinPoint joinPoint, String branchId) {
        System.out.println("Before method:" + joinPoint.getSignature());

        System.out.println("Creating Employee with name - " + branchId);
    }

    @After(value = "execution(* ru.example.springaop.SomeService.*(..)) and args(branchId)")
    public void afterAdvice(JoinPoint joinPoint, String branchId) {
        System.out.println("After method:" + joinPoint.getSignature());

        System.out.println("Successfully created Employee with name - " + branchId );
    }
}
