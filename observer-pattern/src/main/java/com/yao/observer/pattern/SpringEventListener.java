package com.yao.observer.pattern;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * spring的事件监听机制
 * @author: <a href="tivenninesongs@163.com">yaoxuguang</a>
 * @createDate: Created in 2019/12/10 17:33
 */
public class SpringEventListener {
    //ApplicationEvent 应用事件
    //ApplicationListener 应用监听器

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext();
        //当相对应的事件出发时，监听器监听到变化出发监听器的执行
        context.addApplicationListener((ApplicationListener<MyApplicationEvent>) event
                -> System.out.println(event.getSource()));
        context.refresh();
        //发布一个事件
        context.publishEvent(new MyApplicationEvent("hello world"));
    }

    private static class MyApplicationEvent extends ApplicationEvent{

        public MyApplicationEvent(Object source) {
            super(source);
        }
    }
}


