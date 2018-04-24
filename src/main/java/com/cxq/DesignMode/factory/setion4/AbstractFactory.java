package com.cxq.DesignMode.factory.setion4;

public interface AbstractFactory {
    Button createButton();
    Text createText();
}

class LinuxFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }
    @Override
    public Text createText() {
        return new LinuxText();
    }
}

class WindowsFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    @Override
    public Text createText() {
        return new WindowsText();
    }
}

class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory linuxFactory = new LinuxFactory();
        linuxFactory.createButton().processEvent();
        linuxFactory.createText().getWholeText();
        AbstractFactory windowsFactory = new WindowsFactory();
        windowsFactory.createButton().processEvent();
        windowsFactory.createText().getWholeText();
    }
}

interface Button {
    void processEvent();
}

interface Text {
    void getWholeText();
}

class LinuxButton implements Button {
    @Override
    public void processEvent() {
        System.out.println("Inside LinuxButton::processEvent() method.");
    }
}

class LinuxText implements Text {
    @Override
    public void getWholeText() {
        System.out.println("Inside LinuxText::getWholeText() method.");
    }
}

class WindowsButton implements Button {
    @Override
    public void processEvent() {
        System.out.println("Inside WindowsButton::processEvent() method.");
    }
}

class WindowsText implements Text {
    @Override
    public void getWholeText() {
        System.out.println("Inside WindowsText::getWholeText() method.");
    }
}