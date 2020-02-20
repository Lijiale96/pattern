package com.bjsxt.proxy.Proxy.staticProxy;

public class Client6 {
    public static void main(String[] args) {
Star real = new RealStar();
Star proxy = new ProxyStar(real);

proxy.confer();
proxy.signContract();
proxy.bookTicket();
proxy.sing();

proxy.collectMoney();

    }
}
