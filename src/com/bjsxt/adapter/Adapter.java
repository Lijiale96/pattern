package com.bjsxt.adapter;

/**
 * ������(����������ʽ��
 * ���൱��usb��ps/2��ת����0
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void handleReq() {
       super.request();
    }

}
