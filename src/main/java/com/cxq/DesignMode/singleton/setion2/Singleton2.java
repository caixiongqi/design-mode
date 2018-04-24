package com.cxq.DesignMode.singleton.setion2;

/**
 * 单例模式之懒汉式
 */
class Singleton2 {

    private static Singleton2 singleton2 = null;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

}

/**
 * 单例模式之懒汉式（多线程模式）
 *
 * 使用synchronized同步锁
 */
class Singleton3 {
    private static Singleton3 singleton3 = null;

    private Singleton3() {}

    // 双重检查
    public static Singleton3 getInstance() {
        if (singleton3 == null) {
            synchronized (Singleton3.class) {
                if (singleton3 == null) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}
