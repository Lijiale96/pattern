package com.bjsxt.facade;

public interface 税务局 {
void taxCertificate(); //办理税务登记局
}

class 江阴税务局 implements 税务局{


    @Override
    public void taxCertificate() {
        System.out.println("在江阴税务局办理税务登记证!");
    }
}

