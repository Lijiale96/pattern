package com.bjsxt.facade;

public interface 银行 {
void openAccount(); //办理税务登记局
}

class 中国银行 implements 银行{

    @Override
    public void openAccount() {
        System.out.println("在中国银行开户!");
    }
}

