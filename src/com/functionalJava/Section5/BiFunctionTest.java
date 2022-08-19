package com.functionalJava.Section5;

import java.util.function.BiFunction;

public class BiFunctionTest {

    public static void main(String[] args) {
        BiFunction<String, String, Integer> biFunction = (s1, s2) -> s1.concat(s2).length();
        Integer apply = biFunction.apply("Dongsoo", "Kim");
        System.out.println(apply);
    }

}
