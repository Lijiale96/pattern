package com.bjsxt.proxy.Proxy.dynamic;

public class ProxyStar implements Star {

   StarHandler handler;
    private Object[] args;

    public ProxyStar(Star star) {
        super();
        this.handler = handler;
    }

    @Override
    public void confer() {
        handler.invoke();
    }

    @Override
    public void signContract() {
        handler.invoke();
    }

    @Override
    public void bookTicket() {
        handler.invoke();
    }

    @Override
    public void sing() {
        handler.invoke();
    }

    @Override
    public void collectMoney() {
        handler.invoke();
    }
}
