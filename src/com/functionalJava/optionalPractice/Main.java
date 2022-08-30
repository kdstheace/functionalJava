package com.functionalJava.optionalPractice;

import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> strStream = Stream.of("ABC", "ab", "abcd", "skljg", "sj");
        strStream.filter(str -> str.length() > 3).peek(System.out::println).map(String::toUpperCase).peek(System.out::println).forEach(
            System.out::println);
        IntFunction
    }
}
