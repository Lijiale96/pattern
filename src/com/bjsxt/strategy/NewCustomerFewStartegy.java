package com.bjsxt.strategy;

public class NewCustomerFewStartegy  implements Strategy{

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("�����ۣ�ԭ�ۣ�");
        return standardPrice;

    }
}
