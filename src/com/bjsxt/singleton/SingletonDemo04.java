package com.bjsxt.singleton;

public class SingletonDemo04 {
    private static class SigleletonClassInstance{
        private static final  SingletonDemo04 instance = new SingletonDemo04();

    }

    private SingletonDemo04(){}

    //����û��ͬ��������Ч�ʸ�
    public static  SingletonDemo04 getInstance(){
        return SigleletonClassInstance.instance;
    }
}
