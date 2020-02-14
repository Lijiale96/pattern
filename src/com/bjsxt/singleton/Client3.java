package com.bjsxt.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.CountDownLatch;

/**
 * ���Զ��̻߳��������ִ�������ģʽ��Ч��
 */
public class Client3 {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        int threadNum =10;

        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);


        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000000; i++) {
                        Object o = SingletonDemo01.getInstance();
                        //Object o =SingletonDemo05.INSTANCE;
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
             countDownLatch.await(); //main�߳�������ֱ����������Ϊ0���Ż����ִ�У�
            long end = System.currentTimeMillis();
            System.out.println("�ܺ�ʱ��"+(end-start));
        }
    }

