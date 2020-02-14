package com.bjsxt.factory.abstractFactory;

public class Client {
    public static void main(String[] args) {
        CarFactory factory = new LowCarFactory();
        Engine e = factory.createEngine();
     e.run();
     e.start();
    }
}
