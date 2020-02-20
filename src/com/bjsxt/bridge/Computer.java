package com.bjsxt.bridge;

public interface Computer {
  void sale();
}

class Desktop implements Computer{

    @Override
    public void sale() {
        System.out.println("����̨ʽ��");
    }
}
class Laptop implements Computer{

    @Override
    public void sale() {
        System.out.println("���۱ʼǱ�");
    }
}

class Pad implements Computer{

    @Override
    public void sale() {
        System.out.println("����ƽ�����");
    }
}

class LenovoDesktop extends Desktop{
    @Override
    public void sale() {
        System.out.println("��������̨ʽ��");
    }
}
class LenovoLaptop implements Computer{

    @Override
    public void sale() {
        System.out.println("��������ʼǱ�");
    }
}

class LenovoPad implements Computer{

    @Override
    public void sale() {
        System.out.println("��������ƽ�����");
    }
}

class SzDesktop extends Desktop{
    @Override
    public void sale() {
        System.out.println("��������̨ʽ��");
    }
}
class SzLaptop implements Computer{

    @Override
    public void sale() {
        System.out.println("�������ݱʼǱ�");
    }
}

class SzPad implements Computer{

    @Override
    public void sale() {
        System.out.println("��������ƽ�����");
    }
}

class DellDesktop extends Desktop{
    @Override
    public void sale() {
        System.out.println("����Dell̨ʽ��");
    }
}
class DellLaptop implements Computer{

    @Override
    public void sale() {
        System.out.println("����Dell�ʼǱ�");
    }
}

class DellPad implements Computer{

    @Override
    public void sale() {
        System.out.println("������Dellƽ�����");
    }
}