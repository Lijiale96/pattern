package com.bjsxt.command;

//������/������
public class Invoke {
private Command command;//Ҳ����ͨ������List<Command>���ɺܶ�������󣬽������������ݿ�ײ��ʳ�����������ƵĽṹ

    public Invoke(Command command) {
        this.command = command;
    }

    //ҵ�񷽷������ڵ���������ķ���
    public void call(){
        command.execute();
    }
}
