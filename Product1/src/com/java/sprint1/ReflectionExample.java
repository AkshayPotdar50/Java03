package com.java.sprint1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

/*Reflection in Java refers to the ability of a program
 to inspect or modify its own structure or behavior at
 runtime. It allows you to examine or modify the behavior
 of methods, fields, and classes dynamically, rather than
 statically during compilation.*/

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // Get the class object for String
        Class<?> stringClass = String.class;

        // Get all public methods of String class
        Method[] methods = stringClass.getMethods();
        Annotation[] methods1=stringClass.getAnnotations();
        System.out.println(Arrays.toString(methods1));

        // Print all the method names
        System.out.println("Methods of String class:");
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        // Create an instance of String class
        String str = "Hello, reflection!";

        // Get the length() method of String class
        Method lengthMethod = stringClass.getMethod("length");

        // Invoke the length() method dynamically
        int length = (int) lengthMethod.invoke(str);
        System.out.println("Length of the string: " + length);
    }
}
