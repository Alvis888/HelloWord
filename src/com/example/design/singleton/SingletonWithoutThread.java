package com.example.design.singleton;

/**
 *  懒汉式单利模式-------单线程
 */
public class SingletonWithoutThread {
    /**
     * 初始化变量为null
     */
    private static SingletonWithoutThread  singletonWithoutThread=null;

    /**
     * 获取instance
     * @return
     */
    public static SingletonWithoutThread getInstance(){
        // 判断是否已经被创建
        if(null==singletonWithoutThread)
            singletonWithoutThread=new SingletonWithoutThread();
        return singletonWithoutThread;
    }
    private SingletonWithoutThread(){
    }

    /**
     * 输出信息
     * @param str
     * @return
     */
    public void say(String str){
        System.out.println(str);
    }
}
