package com.yao.observer.pattern;

import java.util.Observable;

/**
 * java的观察者模式
 * @author: <a href="tivenninesongs@163.com">yaoxuguang</a>
 * @createDate: Created in 2019/12/10 17:10
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();//测试git的分支合并-test-branch
        observable.addObserver((o, value) -> System.out.println(value));
        observable.setChanged();
        observable.notifyObservers("hello world");
    }

    static class MyObservable extends Observable {
        @Override
        protected synchronized void setChanged() {
            super.setChanged();
        }
    }
}
