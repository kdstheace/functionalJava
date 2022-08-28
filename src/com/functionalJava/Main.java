package com.functionalJava;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Optional<String> helloOpt = Optional.<String>of("hello");
        String hello = helloOpt.orElse("fire");
        System.out.println(hello);
    }
}
// ----1-----
// hello
// it's me
// ----2-----