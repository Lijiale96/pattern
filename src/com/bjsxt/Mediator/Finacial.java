package com.bjsxt.Mediator;

public class Finacial implements Department {
    private Mediator m;//�����н��ߣ��ܾ���������

    public Finacial(Mediator m) {
        super();
        this.m = m;
        m.register("finacial",this);
    }

    @Override
    public void selfAction() {
        System.out.println("�㱨������ûǮ�ˣ�Ǯ̫�࣬��ô��");
    }

    @Override
    public void outAction() {
        System.out.println("��Ǯ��");
    }
}
