package com.bjsxt.strategy;

public class Client {
    public static void main(String[] args) {
        Strategy s1 = new OldCustomerManyStartegy();
        Context ctx = new Context(s1);

        ctx.pringPrice(998);



    }
}
