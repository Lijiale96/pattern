package com.bjsxt.builder;

public class  SxtAirShipBuilder implements AirShipBuilder {//StringBuilder �Ժ�ѧϰXML�����У�JDOM���е��ࣺDomBuilder��SaxBuilder
    @Override
    public Engine builderEngine() {
        System.out.println("�������մ�ѧ������");
        return new Engine("��ɽ��մ�ѧ������");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("�������մ�ѧ�����");
        return new OrbitalModule("��ɽ��մ�ѧ�����");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        System.out.println("�������մ�ѧ������");
        return new EscapeTower("��ɽ��մ�ѧ������");
    }




}
