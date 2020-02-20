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
        System.out.println("真正的方法执行前");
        System.out.println("面谈，签合同，付款，订机票");
        if (method.getName().equals("sing")){
           Object = method.invoke(realStar,args);

       }
        System.out.println("真正的方法执行后");
        System.out.println("收尾款");
        return object;
    }

    public void invoke() {
    }
}
