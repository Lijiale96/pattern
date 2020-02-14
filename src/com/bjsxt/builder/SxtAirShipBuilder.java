package com.bjsxt.builder;

public class  SxtAirShipBuilder implements AirShipBuilder {//StringBuilder 以后学习XML解析中，JDOM库中的类：DomBuilder，SaxBuilder
    @Override
    public Engine builderEngine() {
        System.out.println("构建江苏大学发动机");
        return new Engine("完成江苏大学发动机");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("构建江苏大学轨道舱");
        return new OrbitalModule("完成江苏大学轨道舱");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        System.out.println("构建江苏大学逃逸塔");
        return new EscapeTower("完成江苏大学逃逸塔");
    }




}
