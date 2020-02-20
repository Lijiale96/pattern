package com.bjsxt.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * ԭ��ģʽ�����,ʹ�����л��ͷ����л��ķ�ʽʵ����̣�
 */
public class Client3 {

    public static void main(String[] args) throws Exception {
        Date date = new Date(213213232342L);
        Sheep s1 = new Sheep("�����",date);
        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println(s1.getBirthday());

       // Sheep2 s2= (Sheep2) s1.clone();//ʵ����̡�s2�����birthday��һ���¶���
      //  ʹ�����л��ͷ����л��ķ�ʽʵ����̣�
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream  oos = new ObjectOutputStream(bos);
        oos.writeObject(s1);
        byte[] bytes =  bos.toByteArray();
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
         Sheep s2 = (Sheep) ois.readObject();//��¡�õĶ���


        date.setTime(265431464542L);
        System.out.println(s1.getBirthday());
        s2.setSname("�����");
        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());

    }
}
