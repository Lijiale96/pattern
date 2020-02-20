package com.bjsxt.bridge;

public interface Computer {
  void sale();
}

class Desktop implements Computer{

    @Override
    public void sale() {
        System.out.println("销售台式机");
    }
}
class Laptop implements Computer{

    @Override
    public void sale() {
        System.out.println("销售笔记本");
    }
}

class Pad implements Computer{

    @Override
    public void sale() {
        System.out.println("销售平板电脑");
    }
}

class LenovoDesktop extends Desktop{
    @Override
    public void sale() {
        System.out.println("销售联想台式机");
    }
}
class LenovoLaptop implements Computer{

    @Override
    public void sale() {
        System.out.println("销售联想笔记本");
    }
}

class LenovoPad implements Computer{

    @Override
    public void sale() {
        System.out.println("销售联想平板电脑");
    }
}

class SzDesktop extends Desktop{
    @Override
    public void sale() {
        System.out.println("销售神州台式机");
    }
}
class SzLaptop implements Computer{

    @Override
    public void sale() {
        System.out.println("销售神州笔记本");
    }
}

class SzPad implements Computer{

    @Override
    public void sale() {
        System.out.println("销售神州平板电脑");
    }
}

class DellDesktop extends Desktop{
    @Override
    public void sale() {
        System.out.println("销售Dell台式机");
    }
}
class DellLaptop implements Computer{

    @Override
    public void sale() {
        System.out.println("销售Dell笔记本");
    }
}

class DellPad implements Computer{

    @Override
    public void sale() {
        System.out.println("销售神Dell平板电脑");
    }
}