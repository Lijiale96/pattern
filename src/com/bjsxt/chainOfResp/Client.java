package com.bjsxt.chainOfResp;

public class Client {
    public static void main(String[] args) {
        Leader a = new Director("�����");
        Leader b = new Manager("�����");
        Leader c = new GeneralManager("������");
        Leader b2 = new ViceGeneralManager("������");

        //��֯����������Ĺ�ϵ
        a.setNextLeader(b);
        b.setNextLeader(b2);
        b2.setNextLeader(c);

        //��ʼ��ٲ���
        LeaveRequest req1 = new LeaveRequest("�����", 31, "����ʿ�ϼҽ�飡");
        a.handleRequest(req1);
    }
}

