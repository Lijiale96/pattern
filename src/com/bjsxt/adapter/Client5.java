package com.bjsxt.adapter;
/**
 * �ͻ�����
 * ���൱�������еıʼǱ���ֻ��usb�ӿڣ�
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
