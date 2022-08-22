package com.functionalJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Object> empty = Stream.empty();
        System.out.println(empty.count());
        List<String> strings = Arrays.asList("hello", "its me");

    }
}
// ----1-----
// hello
// it's me
// ----2-----