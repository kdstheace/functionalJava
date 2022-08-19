package com.functionalJava.Section5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String ... args){
        List<String> list = new ArrayList<>();
        list.add("Basics");
        list.add("");
        list.add("Strong");
        list.add("");
        list.add("BasicsStrong");

        // Predicate<String> predicate = s -> !s.isEmpty();
        List<Boolean> result1 = testIfEmpty(list, s -> !s.isEmpty());
        System.out.println(result1);
        List<Boolean> collect = list.stream().map(s -> !s.isEmpty()).toList();
        System.out.println(collect);
        System.out.println("********");
        System.out.println(filterList(list, s->!s.isEmpty()));
        System.out.println(list.stream().filter(str->!str.isEmpty()).toList());

        Predicate<String> filter = s -> s.contains("Basics");
        System.out.println(filterList(list, filter));

        List<Integer> intList = List.of(1, 4, 6, 7, 8);
        Predicate<Integer> integerFilter = e -> e % 2 == 0;
        List<Integer> integers = filterList(intList, integerFilter);
        System.out.println(integers);

    }

    public static List<Boolean> testIfEmpty(List<String> strList, Predicate<String> prd){
        List<Boolean> boolList = new ArrayList<>();
        for (String s : strList) {
            boolList.add(prd.test(s));
        }
        return boolList;
    }

    public static <T> List<T> filterList(List<T> strList, Predicate<T> prd){
        List<T> list = new ArrayList<>();
        for (T s : strList) {
            if(prd.test(s)) list.add(s);
        }
        return list;
    }
}
