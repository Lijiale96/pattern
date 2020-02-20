package com.bjsxt.facade;

public interface 质检局 {
void orgCodeCertificate(); //办理税务登记局
}

class 江阴质检局 implements 质检局{

    @Override
    public void orgCodeCertificate() {
        System.out.println("在江阴税务局办理税务登记证!");
    }
}

