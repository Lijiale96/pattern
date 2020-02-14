package com.bjsxt.factory.abstractFactory;

public interface Engine {
    void  run();
    void start();
}

class LuxuryEngine implements Engine {

    @Override
    public void run() {
        System.out.println("������ѹ");
    }

    @Override
    public void start() {
        System.out.println("������ѹ�������Զ���ͣ");
    }
}

class LowEngine implements Engine {

    @Override
    public void run() {
        System.out.println("������");
    }

    @Override
    public void start() {
        System.out.println("���������������Զ���ͣ");
    }
}