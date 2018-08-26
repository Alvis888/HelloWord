package com.example.design.Build;
/**
 * 具体的建造者
 */
public class Hello  extends HelloWorldBuilder {

    private  HelloWorldProduct product=new HelloWorldProduct();
    @Override
    public void buildHello() {
        product.add("hello");
    }

    @Override
    public void buildWorld() {
        //product.add("world !");
    }

    @Override
    public HelloWorldProduct getProduct() {
        return product;
    }
}
