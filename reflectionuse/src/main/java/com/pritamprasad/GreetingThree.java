package com.pritamprasad;

public class GreetingThree extends Greeting{
    @Override
    public void sayHello(String name) {
        System.out.println("Hello "+ name + " from "+ this.getClass().getName());
    }
}
