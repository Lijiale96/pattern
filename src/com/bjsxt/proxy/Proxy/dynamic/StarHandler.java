package com.bjsxt.proxy.Proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
    Star realStar;
    private java.lang.Object Object;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       Object object = null;
        System.out.println("�����ķ���ִ��ǰ");
        System.out.println("��̸��ǩ��ͬ���������Ʊ");
        if (method.getName().equals("sing")){
           Object = method.invoke(realStar,args);

       }
        System.out.println("�����ķ���ִ�к�");
        System.out.println("��β��");
        return object;
    }

    public void invoke() {
    }
}
