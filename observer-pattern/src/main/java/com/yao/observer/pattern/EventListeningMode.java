package com.yao.observer.pattern;

import java.util.EventListener;
import java.util.EventObject;

/**
 * java中的事件监听模式
 * @author: <a href="tivenninesongs@163.com">yaoxuguang</a>
 * @createDate: Created in 2019/12/10 17:24
 */
public class EventListeningMode {
    //Eventobject 事件对象
    //EventListener 事件监听器

    public static void main(String[] args) {
        EventObject myEventobject = new EventObject(new MyEventListener());
        MyEventListener myEventListener = (MyEventListener) myEventobject.getSource();
        myEventListener.listener("姚旭光");
    }

    static class MyEventListener implements EventListener {
        public String listener(String param){
            System.out.println("java中的事件监听模式：" + param);
            return param;
        }
    }

}
