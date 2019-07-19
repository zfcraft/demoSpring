package com.zlk.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAop {

    // �����
    public void anyMethod() { }

    // ǰ��֪ͨ
    // ��Ŀ����ķ���ִ��֮ǰִ��
    public void beforeAdvice() {
        System.out.println("ǰ��֪ͨ��");
    }
    
    // ����֪ͨ
    // ��Ŀ����ķ���ִ��֮��ִ�У��������������쳣������֪ͨҲ��ִ��
    public void afterAdvice() {
        System.out.println("����֪ͨ��");
    }
    
    // ����֪ͨ
    // ��������ִ�к��֪ͨ, ��������쳣, �򲻻�ִ��
    public void afterReturningAdvice() {
        System.out.println("����֪ͨ��");
    }
    
    // ����֪ͨ
    // ��Ŀ���෽����ִ��ǰ��ִ��
    public void aroundAdvice(ProceedingJoinPoint joinPoint) {
        System.out.println("����֪ͨ - ǰ");
        
        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        
        System.out.println("����֪ͨ - ��");
    }
    
    // �쳣�׳�֪ͨ
    // ��Ŀ���෽��ִ�г����쳣ʱ, �Ż���ø�֪ͨ
    public void afterThrowingAdvice() {
        System.out.println("�쳣�׳�֪ͨ");
    }
}

