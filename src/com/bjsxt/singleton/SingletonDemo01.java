package com.bjsxt.singleton;

/**
 * ���Զ���ʽ����ģʽ
 * @author A
 *
 */
public class SingletonDemo01 {

	//���ʼ�������������������û����ʱ���ص����ƣ���������ʱ����Ȼ�����̰߳�ȫ��
	private static SingletonDemo01 instance = new SingletonDemo01();  //���ʼ�������������������
	
	private SingletonDemo01() {
		
	}
	
	//����û��ͬ��������Ч�ʸ�
	public static SingletonDemo01 getInstance() {
		return instance;
	}
}
