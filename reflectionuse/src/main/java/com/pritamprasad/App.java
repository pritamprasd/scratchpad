package com.pritamprasad;

import org.reflections.Reflections;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;

import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Reflections reflections = new Reflections("com.pritamprasad");

//        Set<Class<? extends GreetingService>> subTypesOf = reflections.getSubTypesOf(GreetingService.class);
//        System.out.println(subTypesOf.size());

        Set<Class<? extends Greeting>> subTypesOf = reflections.getSubTypesOf(Greeting.class);
        System.out.println(subTypesOf.size());
    }
}
