package com.bjsxt.prototype;

import java.util.Date;

/**
 * ԭ��ģʽ����̣�
 */
public class Client2 {

    public static void main(String[] args) throws Exception {
        Date date = new Date(213213232342L);
        Sheep2 s1 = new Sheep2("�����",date);
        Sheep2 s2= (Sheep2) s1.clone();//ʵ����̡�s2�����birthday��һ���¶���

        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println(s1.getBirthday());

        date.setTime(265431464542L);

        System.out.println(s1.getBirthday());

        s2.setSname("�����");
        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());

    }
}
