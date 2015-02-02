package com.stevenheseltine.api.resource.model;

public class HelloWorld {
    private String greeting;
    private String name;

    public HelloWorld(String greeting, String name) {
        this.greeting = greeting;
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getName() {
        return name;
    }
}
