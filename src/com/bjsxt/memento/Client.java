package com.bjsxt.memento;

public class Client {
    public static void main(String[] args) {
        CareTaker taker = new CareTaker();

        Emp emp = new Emp("李家乐",25,900);
        System.out.println("第一次创建对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());

        taker.setMemeto(emp.memento());   //备忘一次

        emp.setAge(24);
        emp.setEname("阿康");
        emp.setSalary(9000);
        System.out.println("第二次创建对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());

        emp.recovery(taker.getMemeto());//恢复到备忘录对象保存的转态
        System.out.println("第三次创建对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());


    }
}
