package com.bjsxt.factory.simplefactory;

public class CatFactory {

    public static Car createCar(String type){
        if ("�µ�".equals(type)) {
            return new Audi();
        }
            else if ("����".equals(type)){
                return new Benz();
            }else{
                return null;
            }
        }
    }

