package com.functionalJava;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Optional<String> o = Optional.ofNullable(null);
        System.out.println(o.orElseGet(() -> "g"));
    }
}
// ----1-----
// hello
// it's me
// ----2-----