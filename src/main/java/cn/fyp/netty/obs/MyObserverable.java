package cn.fyp.netty.obs;

import java.util.Observable;

public class MyObserverable extends Observable {
    void doSomething() {
        //TODO 修改当前对象的一些属性
        setChanged();
        notifyObservers();
    }
}
