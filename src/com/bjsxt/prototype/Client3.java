package com.bjsxt.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 原型模式（深复刻,使用序列化和反序列化的方式实现深复刻）
 */
public class Client3 {

    public static void main(String[] args) throws Exception {
        Date date = new Date(213213232342L);
        Sheep s1 = new Sheep("张雨昕",date);
        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println(s1.getBirthday());

       // Sheep2 s2= (Sheep2) s1.clone();//实现深复刻。s2对象的birthday是一个新对象
      //  使用序列化和反序列化的方式实现深复刻）
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream  oos = new ObjectOutputStream(bos);
        oos.writeObject(s1);
        byte[] bytes =  bos.toByteArray();
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
         Sheep s2 = (Sheep) ois.readObject();//克隆好的对象


        date.setTime(265431464542L);
        System.out.println(s1.getBirthday());
        s2.setSname("李家乐");
        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());

    }
}
