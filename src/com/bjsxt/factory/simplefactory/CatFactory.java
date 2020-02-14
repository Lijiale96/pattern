package com.bjsxt.factory.simplefactory;

public class CatFactory {

    public static Car createCar(String type){
        if ("°ÂµÏ".equals(type)) {
            return new Audi();
        }
            else if ("±¼³Û".equals(type)){
                return new Benz();
            }else{
                return null;
            }
        }
    }

