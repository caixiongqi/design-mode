package com.cxq.DesignMode.singleton.setion1;

/**
 * 单例模式之饿汉式
 *
 * 类记载时就创建一个静态的对象供外部使用，除非系统重启，这个对象不会改变，所以本身就是线程安全的。
 * Singleton通过将构造方法限定为private避免了类在外部被实例化，在同一个虚拟机范围内，Singleton的唯一实例只能通过getInstance()方法访问。
 */
public class Singleton1 {

    private static Singleton1 singleton1 = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance() {
        return singleton1;
    }
}
