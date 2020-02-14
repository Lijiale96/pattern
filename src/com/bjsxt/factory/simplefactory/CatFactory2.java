package com.bjsxt.factory.simplefactory;

/**
 * 简单工厂类
 *
 */
public class CatFactory2 {

    public static Car createAudi(){
       return new Audi();
        }

    public static Car createBenz(){
        return new Benz();
    }
    }

