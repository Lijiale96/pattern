package com.bjsxt.factory.simplefactory;

/**
 * �򵥹�����
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

