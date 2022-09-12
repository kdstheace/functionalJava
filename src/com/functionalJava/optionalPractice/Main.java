package com.functionalJava.optionalPractice;

import java.io.Serializable;
import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("A", "B", "C", "D", "E");
        StringBuilder sb = new StringBuilder();
        Stream.of(strList).forEach(str -> {
            if(sb.length() != 0){
                sb.append(","); // 문제점 : 람다식 내부에서 오브젝트 내용을 바꾸고 있음(컴파일에러는 안나지만..)
            }
            sb.append(str); //[A, B, C, D, E]
        });
        System.out.println(sb);


    }

    private static Optional<String> test(String str){
        return Optional.of(str.toUpperCase());
    }
    static void oh(String ... args){

    }
}
