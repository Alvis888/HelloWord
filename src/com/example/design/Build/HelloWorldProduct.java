package com.example.design.Build;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品
 */
public class HelloWorldProduct {
    // hello world集合
    List<String> list= new ArrayList<>();

    /***
     * 组装hello world
     * @param part
     */
    public void add(String part){
        list.add(part);
    }

    /**
     * 展示产品
     */
    public void show(){
        for (String item:list) {
            System.out.println(item);
        }
    }
}
