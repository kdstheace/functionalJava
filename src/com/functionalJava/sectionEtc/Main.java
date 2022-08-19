package com.functionalJava.sectionEtc;

import com.functionalJava.sectionEtc.Person.Gender;

import java.util.Optional;
import java.util.function.Predicate;

public class Main {
    public static void main(String ... args){
        var samp = new Sample(10){
        };
        System.out.println(samp.getNum());

    }
}
