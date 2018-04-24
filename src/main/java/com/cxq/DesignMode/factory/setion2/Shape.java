package com.cxq.DesignMode.factory.setion2;


/**
 * 简单工厂模式是由一个工厂对象根据收到的消息决定要创建哪一个类的对象实例。
 */

/**
 * 产品接口
 */
public interface Shape {
    void draw();
}

/**
 * 产品实现类
 */
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

/**
 * 产品实现类
 */
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

/**
 * 产品实现类
 */
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

/**
 * 工厂类
 */
class ShapeFactory {
    public Shape getShape(String type) {
        if ("circle".equals(type)) {
            return new Circle();
        } else if ("rectangle".equals(type)) {
            return new Rectangle();
        } else if ("square".equals(type)) {
            return new Square();
        } else {
            return null;
        }
    }
}

class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape("circle").draw();
        shapeFactory.getShape("rectangle").draw();
        shapeFactory.getShape("square").draw();
    }

}