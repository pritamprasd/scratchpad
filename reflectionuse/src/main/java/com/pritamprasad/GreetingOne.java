package com.pritamprasad;

public class GreetingOne implements GreetingService{
    @Override
    public void sayHello(String name) {
        System.out.println("Hello "+ name + " from "+ this.getClass().getName());
    }
}
