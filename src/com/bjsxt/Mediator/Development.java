package com.bjsxt.Mediator;

public class Development implements Department {
    private Mediator m;//�����н��ߣ��ܾ���������

    public Development(Mediator m) {
        super();
        this.m = m;
        m.register("development",this);
    }

    @Override
    public void selfAction() {
        System.out.println("�㱨������ûǮ�ˣ���Ҫ�ʽ�֧�֣�");
    }

    @Override
    public void outAction() {
        System.out.println("ר�Ŀ��У�������Ŀ��");
    }
}
