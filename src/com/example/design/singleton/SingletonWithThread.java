package com.example.design.singleton;

/**
 *  懒汉式单利模式-------多线程
 */
public class SingletonWithThread {
    /**
     * 声明变量为空
     */
    private static SingletonWithThread singletonWithThread=null;

    /**
     * 获取实例
     * @return
     */
    public static SingletonWithThread  getInstance(){
        // 判断是否已创建
        if(null==singletonWithThread)
            // 多线程等待
            synchronized (SingletonWithoutThread.class){
                // 判断是否已创建    多个新城可能同时
                if (null==singletonWithThread)
                    singletonWithThread=new SingletonWithThread ();
            }
        return singletonWithThread;
    }
    private SingletonWithThread (){
    }

    public void say(String str){
        System.out.println(str);
    }
}
