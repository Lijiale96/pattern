package com.bjsxt.Mediator;

import java.io.FileOutputStream;

public class Client {
    public static void main(String[] args) {
        Mediator m = new President();

        Market market = new Market(m);
        Development devp=new Development(m);
        Finacial f = new Finacial(m);

        market.selfAction();
        market.outAction();

    }
}
