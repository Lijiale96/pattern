package com.bjsxt.factory.simplefactory;


/**
 * 简单工厂的情况下
 *
 */
public class Client02 {   //调用者

    public static void main(String[] args){
        Car c1 = CatFactory.createCar("奥迪");
        Car c2 = CatFactory.createCar("奔驰");

        c1.run();
        c2.run();
    }
}
