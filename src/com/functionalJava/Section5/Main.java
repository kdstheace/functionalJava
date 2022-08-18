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

        // Predicate<String> predicate = s -> !s.isEmpty();

        List<Boolean> result1 = testIfEmpty(list, s -> !s.isEmpty());
        System.out.println(result1);
        List<Boolean> collect = list.stream().map(s -> !s.isEmpty()).toList();
        System.out.println(collect);
        System.out.println("********");
        System.out.println(filterList(list, s->!s.isEmpty()));
        System.out.println(list.stream().filter(str->!str.isEmpty()).toList());

    }

    public static List<Boolean> testIfEmpty(List<String> strList, Predicate<String> prd){
        List<Boolean> boolList = new ArrayList<>();
        for (String s : strList) {
            boolList.add(prd.test(s));
        }
        return boolList;
    }

    public static List<String> filterList(List<String> strList, Predicate<String> prd){
        List<String> list = new ArrayList<>();
        for (String s : strList) {
            if(prd.test(s)) list.add(s);
        }
        return list;
    }
}
