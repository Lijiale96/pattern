package com.bjsxt.memento;

public class Client {
    public static void main(String[] args) {
        CareTaker taker = new CareTaker();

        Emp emp = new Emp("�����",25,900);
        System.out.println("��һ�δ�������"+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());

        taker.setMemeto(emp.memento());   //����һ��

        emp.setAge(24);
        emp.setEname("����");
        emp.setSalary(9000);
        System.out.println("�ڶ��δ�������"+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());

        emp.recovery(taker.getMemeto());//�ָ�������¼���󱣴��ת̬
        System.out.println("�����δ�������"+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());


    }
}
