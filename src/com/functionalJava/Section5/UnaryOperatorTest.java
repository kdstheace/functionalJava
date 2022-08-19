package com.functionalJava.Section5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {

    public static void main(String[] args) {
        //UnaryOperator<T> extends Function<T. T>
        List<Integer> intList = List.of(10, 20, 30, 40, 50);
        UnaryOperator<Integer> uo = i -> i * 100;
        System.out.println(mapper(intList, uo));
    }

    public static <T> List<T> mapper(List<T> param, UnaryOperator<T> operator){
        List<T> resultList = new ArrayList<>();
        for (T t : param) {
            resultList.add(operator.apply(t));
        }
        return resultList;
    }
}
