package com.bjsxt.strategy;

/**
 * 负责和具体的策略类的交互
 * 这样的话，具体的算法和直接的客户端调用分离了，使得算法可以独立于客户端独立的变化
 *如果使用spring的依赖注入功能，还可以通过配置文件，动态的注入不同策略对象，动态的切换不同的算法
 *
 */
public class Context {
    private Strategy startegy;//当前采用的算法对象

    //可以通过构造器来注入
    public Context(Strategy startegy) {
        this.startegy = startegy;
    }

    //通过set方法来注入
    public void setStartegy(Strategy startegy) {
        this.startegy = startegy;
    }
    public void pringPrice(double s){
        System.out.println("您该报价："+startegy.getPrice(s));
    }
}
