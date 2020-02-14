package com.bjsxt.singleton;

import java.io.ObjectStreamException;

/**
 * ��������ʽ����ģʽ(��η�ֹ����ͷ����л�©����
 * @author A
 *
 */
public class SingletonDemo06 {

	//���ʼ��������ʼ�����������ʱ���أ������õ�ʱ���ڴ�����
	private static SingletonDemo06 instance = new SingletonDemo06();  //���ʼ�������������������

	private SingletonDemo06() {  //˽�л�������
		if (instance!=null){
			throw new RuntimeException();
		}
	}
	
	//����ͬ��������Ч�ʵ�
	public static synchronized SingletonDemo06 getInstance() {
		if (instance ==null) {
			instance = new SingletonDemo06();
		}
		return instance;
	}

	//�����л�ʱ�����������readResolve()��ֱ�ӷ��ش˷���ָ���Ķ��󡣶�����Ҫ�����ٴ����¶���
	private Object readResolve() throws ObjectStreamException {
        return instance;
	}

}
