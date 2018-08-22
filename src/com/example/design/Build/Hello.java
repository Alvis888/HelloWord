package com.example.design.Build;

public class Hello  extends HelloWorldBuilder {
    @Override
    void buildHello() {

    }

    @Override
    void buildWorld() {
        System.out.println("hello");
    }
}
