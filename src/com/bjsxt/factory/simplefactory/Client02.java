package com.bjsxt.factory.simplefactory;


/**
 * �򵥹����������
 *
 */
public class Client02 {   //������

    public static void main(String[] args){
        Car c1 = CatFactory.createCar("�µ�");
        Car c2 = CatFactory.createCar("����");

        c1.run();
        c2.run();
    }
}
