package com.bjsxt.adapter;

/**
 * ������(������������ʽ��ʹ������ϵķ�ʽ��������������ϣ�
 * ���൱��usb��ps/2��ת����0
 */
public class Adapter2  implements Target{
  private  Adaptee adaptee;

    @Override
    public void handleReq() {
       adaptee.request();
    }

    public Adapter2(Adaptee adaptee){
        this.adaptee = adaptee;
    }
}
