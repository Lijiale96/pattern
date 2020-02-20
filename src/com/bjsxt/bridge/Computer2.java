package com.bjsxt.bridge;

/**
 * �������͵�ά��
 */
public class Computer2 {

    protected  Brand brand;

    public Computer2(Brand b){
this.brand =b;
    }

    public void sale(){
        brand.sale();
    }
}

class Desktop2 extends Computer2{

    public Desktop2(Brand b) {
       super(b);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("����̨ʽ��");
    }
}

class Laptop2 extends Computer2{

    public Laptop2(Brand b) {
        super(b);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("���۱ʼǱ�");
    }
}