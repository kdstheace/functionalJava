package com.functionalJava.optionalPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4);
        integers.forEach(System.out::println);
        

    }

    private static Optional<String> test(String str){
        return Optional.of(str.toUpperCase());
    }
}
