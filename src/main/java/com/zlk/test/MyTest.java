package com.zlk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zlk.service.MyService;

public class MyTest {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");

        MyService myService = (MyService) beanFactory.getBean("myService");

        // ����ǰ��֪ͨ
        myService.before();

        // ��������֪ͨ
//      myService.after();

        // ���Ժ���֪ͨ
//      myService.afterReturning();

        // ���Ի���֪ͨ
//      myService.around();

        // �����쳣�׳�֪ͨ
//      myService.afterThrowing();
    }
}
