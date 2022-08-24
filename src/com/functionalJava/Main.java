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
        Stream.of("bb", "aa", "bsd", "ccc", "ddd", "abc", "99", "Cbb", "Taa", "taa").sorted().forEach(a -> System.out.print(a + " "));
        Stream<String> strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
        

    }
}
// ----1-----
// hello
// it's me
// ----2-----