package com.bjsxt.bridge;

/**
 * Ʒ��
 */
public interface Brand {
void sale();
}
class Lenovo implements Brand{

    @Override
    public void sale() {
        System.out.println("�����������");
    }
}
class Dell implements Brand{

    @Override
    public void sale() {
        System.out.println("���۴�������");
    }
}
class Sz implements Brand{

    @Override
    public void sale() {
        System.out.println("�������ݵ���");
    }
}