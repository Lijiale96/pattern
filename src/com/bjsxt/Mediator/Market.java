package com.bjsxt.Mediator;

public class Market implements Department {
    private Mediator m;//�����н��ߣ��ܾ���������

    public Market(Mediator m) {
        super();
        this.m = m;
        m.register("market",this);
    }

    @Override
    public void selfAction() {
        System.out.println("�㱨��������Ŀ�нӵĽ��ȣ���Ҫ�ʽ�֧�֣�");
        m.command("finacial");
    }

    @Override
    public void outAction() {
        System.out.println("��ȥ����Ŀ��");
    }
}
