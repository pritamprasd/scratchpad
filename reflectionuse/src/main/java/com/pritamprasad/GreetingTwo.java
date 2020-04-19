package com.pritamprasad;

public class GreetingTwo implements GreetingService{
    @Override
    public void sayHello(String name) {
        System.out.println("Hello "+ name + " from "+ this.getClass().getName());
    }
}
