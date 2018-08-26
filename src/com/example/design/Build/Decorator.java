package com.example.design.Build;

/**
 * 指挥者
 */
public class Decorator {
    public void construct(HelloWorldBuilder builder) {
        builder.buildHello();
        builder.buildWorld();
    }
}
