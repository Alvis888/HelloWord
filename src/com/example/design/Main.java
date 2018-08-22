package com.example.design;

import com.example.design.sampleFactory.Say;
import com.example.design.sampleFactory.SayFactory;
import com.example.design.singleton.SingletonWithThread;
import com.example.design.singleton.SingletonWithoutThread;

import static com.sun.corba.se.impl.ior.iiop.JavaSerializationComponent.singleton;

public class Main {

    public static void main(String[] args) {
        singleton();
        System.out.println("---------------------------------------------------------");
        SampleFactory();
        System.out.println("---------------------------------------------------------");
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
    /**
     * 简单工厂模式
     */
    private static void SampleFactory(){
        System.out.println("简单工厂模式");
        Say say=null;
        say=SayFactory.createSay("hello");
        say.say();
        say=SayFactory.createSay("world");
        say.say();
    }

    /**
     * 建造者模式
     */
    private static void build(){

    }
}
