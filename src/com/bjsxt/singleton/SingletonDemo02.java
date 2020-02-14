package com.bjsxt.singleton;

/**
 * 测试懒汉式单例模式
 * @author A
 *
 */
public class SingletonDemo02 {

	//类初始化，不初始化这个对象（延时加载，真正用的时候在创建）
	private static SingletonDemo02 instance = new SingletonDemo02();  //类初始化，立即加载这个对象
	
	private SingletonDemo02() {  //私有化构造器
		
	}
	
	//方法同步，调用效率低
	public static synchronized SingletonDemo02 getInstance() {
		if (instance ==null) {
			instance = new SingletonDemo02();
		}
		return instance;
	}
}
