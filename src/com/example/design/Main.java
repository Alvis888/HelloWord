package com.example.design;

import com.example.design.singleton.SingletonWithThread;
import com.example.design.singleton.SingletonWithoutThread;

public class Main {

    public static void main(String[] args) {
        singleton();
    }

    /**
     * 单例模式
     */
    private static void singleton(){
        // 单线程
        System.out.println("单例模式---单线程");
        SingletonWithoutThread singletonWithoutThread=SingletonWithoutThread.getInstance();
        singletonWithoutThread.say("Hello World !");

        //多线程
        System.out.println("单例模式---多线程");
        SingletonWithThread singletonWithThread=SingletonWithThread.getInstance();
        singletonWithThread.say("Hello World ！");
    }
}
