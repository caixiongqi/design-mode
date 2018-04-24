package com.cxq.DesignMode.factory.setion3;

/**
 * 工厂方法模式
 *
 * 定义一个创建对象的工厂接口，让子类决定实例化哪一个类，将实际创建工作推迟到子类当中。
 */
public interface ShapeFactory {
    Shape getShape();
}

class CircleFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        return new Circle();
    }
}

class RectangleFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}

class SquareFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        return new Square();
    }
}

class FactoryMethodDemo {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        circleFactory.getShape().draw();
        ShapeFactory rectangleFactory = new RectangleFactory();
        rectangleFactory.getShape().draw();
        ShapeFactory squareFactory = new SquareFactory();
        squareFactory.getShape().draw();
    }
}

/**
 * 产品接口
 */
interface Shape {
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
