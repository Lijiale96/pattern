package com.bjsxt.chainOfResp;

public class Client {
    public static void main(String[] args) {
        Leader a = new Director("张雨昕");
        Leader b = new Manager("李家乐");
        Leader c = new GeneralManager("李政赫");
        Leader b2 = new ViceGeneralManager("尹世理");

        //组织责任链对象的关系
        a.setNextLeader(b);
        b.setNextLeader(b2);
        b2.setNextLeader(c);

        //开始请假操作
        LeaveRequest req1 = new LeaveRequest("李家乐", 31, "回瑞士老家结婚！");
        a.handleRequest(req1);
    }
}

