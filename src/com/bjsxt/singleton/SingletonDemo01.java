package com.bjsxt.singleton;

/**
 * 测试饿汉式单例模式
 * @author A
 *
 */
public class SingletonDemo01 {

	//类初始化，立即加载这个对象（没有延时加载的优势）。加载类时，天然的是线程安全的
	private static SingletonDemo01 instance = new SingletonDemo01();  //类初始化，立即加载这个对象
	
	private SingletonDemo01() {
		
	}
	
	//方法没有同步，调用效率高
	public static SingletonDemo01 getInstance() {
		return instance;
	}
}
