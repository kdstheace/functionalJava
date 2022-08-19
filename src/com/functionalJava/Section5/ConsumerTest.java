package com.functionalJava.Section5;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String ... args){
        List<Integer> list = List.of(34, 67, 27, 85, 23, 97, 44, 67);
        // Consumer<Integer> consumer = System.out::println;
        printElements(list, i -> System.out.println(Math.pow(i, 2)));
    }

    private static <T> void printElements(List<T> list, Consumer<T> consumer){
        for (T integer : list) {
            consumer.accept(integer);
        }

    }

}
