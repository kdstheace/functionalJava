package com.functionalJava.Section5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        //1. not good case
        List<String> strList = List.of("Kat", "Stark", "Robb");

        Map<String, Integer> map = map(strList, strs -> {
            Map<String, Integer> resultMap = new HashMap<>();
            for (String s : strs) {
                resultMap.put(s, s.length());
            }
            return resultMap;
        });
        System.out.println(map);

        //2. better case
        Map<String, Integer> map2 = map2(strList, String::length);
        System.out.println(map2);
    }

    public static <T, R> R map(T t, Function<T, R> function){
        return function.apply(t);
    }

    public static <T, R> Map<T, R> map2(List<T> list, Function<T, R> function){
        Map<T, R> map = new HashMap<>();
        for (T t : list) {
            map.put(t, function.apply(t));
        }
        return map;
    }
}
