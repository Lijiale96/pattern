package com.bjsxt.facade;

public class Client1 {
    public static void main(String[] args) {
//        ���̾� a = new �������̾�();
//        a.checkName();
//        �ʼ�� b = new �����ʼ��();
//        b.orgCodeCertificate();
//        ˰��� c = new ����˰���();
//        c.taxCertificate();
//        ���� d = new �й�����();
//        d.openAccount();
   new RegisterFacade().register();
    }
}
