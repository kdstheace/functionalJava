package com.functionalJava.collectorTest;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("A", "B", "C", "D", "E");
        String result = strings.parallelStream().collect(new SampleCollector());
        System.out.println(result);
    }
}
