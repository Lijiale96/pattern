package com.bjsxt.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责人类
 * 负责管理备忘录对象
 */
public class CareTaker {
private EmpMemeto memeto;

//private List<EmpMemeto> list = new ArrayList<EmpMemeto>();

public EmpMemeto getMemeto(){
    return memeto;
}
public void setMemeto(EmpMemeto memeto){
    this.memeto =memeto;
}
}
