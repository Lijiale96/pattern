package com.bjsxt.adapter;

/**
 * 被适配的类
 * （相当于例子中的，ps/2键盘）
 */
public class Adaptee {
    public void request(){
        System.out.println("可以完成客户请求需要的功能!");
    }
}
