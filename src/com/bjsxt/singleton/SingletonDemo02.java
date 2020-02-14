package com.bjsxt.singleton;

/**
 * ��������ʽ����ģʽ
 * @author A
 *
 */
public class SingletonDemo02 {

	//���ʼ��������ʼ�����������ʱ���أ������õ�ʱ���ڴ�����
	private static SingletonDemo02 instance = new SingletonDemo02();  //���ʼ�������������������
	
	private SingletonDemo02() {  //˽�л�������
		
	}
	
	//����ͬ��������Ч�ʵ�
	public static synchronized SingletonDemo02 getInstance() {
		if (instance ==null) {
			instance = new SingletonDemo02();
		}
		return instance;
	}
}
