package com.functionalJava.section4;

import java.util.function.BiConsumer;
import java.util.function.Function;

public class Main {
    public static void main(String ... args){
        Name name = () -> System.out.println("sexysoo");
        name.myName();

        Operation op = (x, y) -> System.out.println(x + y);
        op.operate(2, 3);
        Operation multiply = (x, y) -> System.out.println(x * y);
        multiply.operate(9, 12);
        BiConsumer<Integer, Integer> multi = (x, y) -> System.out.println(x * y);
        multi.accept(9, 12);

        LengthOfString ls = x -> x.length();
        System.out.println(ls.length("hello2"));
        LengthOfString ls2 = x -> {
            int l = x.length();
            System.out.println("Length of the String is " + l);
            return l;
        };
        System.out.println(ls2.length("basics----"));
        Function<String, Integer> sample = String::length;
        System.out.println(sample.apply("hello"));
    }

}
