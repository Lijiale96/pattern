package com.bjsxt.observer;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Subject {

    protected List<Observer> list =new ArrayList<Observer>();

    public void registerObserver(Observer obs){
        list.add(obs);
    }

    public void removeObserver(Observer obs){
        list.add(obs);
    }
    //֪ͨ���еĹ۲��߸���״̬
  public void notifyAllObservers(){
      for (Observer objs:list) {
          objs.update(this);

      }
  }
}
