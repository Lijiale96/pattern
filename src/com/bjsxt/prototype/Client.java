package com.bjsxt.prototype;

import java.util.Date;

/**
 * 测试原型模式（浅克隆）
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Date date = new Date(213214342L);
        Sheep s1 = new Sheep("张雨昕",date);
        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println(s1.getBirthday());
        //s1.setBirthday(new Date(233444412321L));

        date.setTime(2654546464542L);
        System.out.println(s1.getBirthday());

        Sheep s2= (Sheep) s1.clone();
        s2.setSname("李家乐");
        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());
    }
}
