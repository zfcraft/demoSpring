package com.zlk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zlk.service.MyService;

public class MyTest {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");

        MyService myService = (MyService) beanFactory.getBean("myService");

        // 测试前置通知
        myService.before();

        // 测试最终通知
//      myService.after();

        // 测试后置通知
//      myService.afterReturning();

        // 测试环绕通知
//      myService.around();

        // 测试异常抛出通知
//      myService.afterThrowing();
    }
}
