package com.functionalJava.section3;

import java.util.stream.IntStream;

public class LambdaExMain {
    public static void main(String ... args){
        //Imperative style
        int sumOfEvens = 0;
        for (int i = 0; i <= 100; i ++){
            if(i % 2 ==0) sumOfEvens+=i;
        }
        System.out.println(sumOfEvens);

        //Declarative or Functional Style
        sumOfEvens = IntStream.rangeClosed(0, 100)
            .filter(a -> a % 2 == 0)
            .reduce((x,y)->x+y)
            .getAsInt();
        System.out.println(sumOfEvens);
    }
}
