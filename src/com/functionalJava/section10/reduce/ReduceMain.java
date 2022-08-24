package com.functionalJava.section10.reduce;

import java.util.stream.Stream;

public class ReduceMain {

    public static void main(String[] args) {
        Integer reduce = Stream.of(5, 2, 6, 21, 7, 1, 2, 5).reduce(0, (a, b) -> a + b);
        Integer reduce2 = Stream.of(5, 2, 6, 21, 7, 1, 2, 5).reduce(0, Integer::sum);
        System.out.println(reduce);
    }

}
