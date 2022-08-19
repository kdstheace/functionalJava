package com.functionalJava.section6;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(12);
        Supplier<Double> randomNum = Math::random;
        System.out.println(randomNum.get());
        BinaryOperator<String> conc = String :: concat;
        BinaryOperator<String> conc2 = ConcatClass :: staticMethod;
        System.out.println(conc.apply("hello", "world"));
        System.out.println(conc2.apply("hello", "world"));
        Function<String, Integer> len = String::length;;
        System.out.println(len.apply("hello"));

        //4Types of Method references
        //1. object :: instanceMethod - System.out :: println
            //MR to an instance method of an existing object.
        //2. Class :: staticMethod - Math :: random, String :: concat
            //MR to a static method of a class
        //3. Class :: instanceMethod
            //MR to an instance method of an input object of a particular type
        //4. Class :: new  ~ Constructor Reference
            //MR to a Constructor
    }

    class ConcatClass{
        static String staticMethod(String a, String b){
            return a + b;
        }
    }

}
