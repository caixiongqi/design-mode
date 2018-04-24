package com.cxq.DesignMode.factory.setion1;

/**
 * 抽象工厂模式，基于反射实现
 */
public abstract class AbstractHumanFactory {

    public abstract <T extends com.cxq.DesignMode.factory.setion1.Human> T createHuman(Class<T> c);
}
