package com.example.design.sampleFactory;

public class SayFactory {

    public static Say createSay(String key) {

        switch (key.toLowerCase()) {
            case "hello":
                return new SayHello();
            case "world":
                return new SayWorld();
            default:
                return null;

        }
    }
}
