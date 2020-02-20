package com.bjsxt.strategy;

public class OldCustomerManyStartegy implements Strategy{

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("¥Ú∞À’€£°");
        return standardPrice*0.8;

    }
}
