package com.bjsxt.strategy;

/**
 * ����;���Ĳ�����Ľ���
 * �����Ļ���������㷨��ֱ�ӵĿͻ��˵��÷����ˣ�ʹ���㷨���Զ����ڿͻ��˶����ı仯
 *���ʹ��spring������ע�빦�ܣ�������ͨ�������ļ�����̬��ע�벻ͬ���Զ��󣬶�̬���л���ͬ���㷨
 *
 */
public class Context {
    private Strategy startegy;//��ǰ���õ��㷨����

    //����ͨ����������ע��
    public Context(Strategy startegy) {
        this.startegy = startegy;
    }

    //ͨ��set������ע��
    public void setStartegy(Strategy startegy) {
        this.startegy = startegy;
    }
    public void pringPrice(double s){
        System.out.println("���ñ��ۣ�"+startegy.getPrice(s));
    }
}
