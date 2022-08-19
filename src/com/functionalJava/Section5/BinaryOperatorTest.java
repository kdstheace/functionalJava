package com.functionalJava.Section5;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

    public static void main(String[] args) {
        BinaryOperator<String> operator = String::concat;
        System.out.println(operator.apply("hello", "hi"));
    }
}

