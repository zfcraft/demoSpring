package com.zlk.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAop {

    // 切入点
    public void anyMethod() { }

    // 前置通知
    // 在目标类的方法执行之前执行
    public void beforeAdvice() {
        System.out.println("前置通知！");
    }
    
    // 最终通知
    // 在目标类的方法执行之后执行，如果程序出现了异常，最终通知也会执行
    public void afterAdvice() {
        System.out.println("最终通知！");
    }
    
    // 后置通知
    // 方法正常执行后的通知, 程序出现异常, 则不会执行
    public void afterReturningAdvice() {
        System.out.println("后置通知！");
    }
    
    // 环绕通知
    // 在目标类方法的执行前后执行
    public void aroundAdvice(ProceedingJoinPoint joinPoint) {
        System.out.println("环绕通知 - 前");
        
        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        
        System.out.println("环绕通知 - 后");
    }
    
    // 异常抛出通知
    // 在目标类方法执行出现异常时, 才会调用该通知
    public void afterThrowingAdvice() {
        System.out.println("异常抛出通知");
    }
}

