package com.bjsxt.adapter;
/**
 * 客户端类
 * （相当于例子中的笔记本，只有usb接口）
 */
public class Client5 {
    public void test1(Target t){
     t.hashCode();

    }

    public static void main(String[] args) {
        Client5 c = new Client5();
        Adaptee a = new Adaptee();
        //Target t = new Adapter();
        Target t = new Adapter2(a);
        c.test1(t);
    }
}
