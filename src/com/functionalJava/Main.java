package com.functionalJava;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        new Thread(()-> System.out.println("hello")).start();
    }
}
// ----1-----
// hello
// it's me
// ----2-----