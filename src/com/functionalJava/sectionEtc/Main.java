package com.functionalJava.sectionEtc;

import com.functionalJava.sectionEtc.Person.Gender;

import java.util.Optional;
import java.util.function.Predicate;

public class Main {
    public static void main(String ... args){
        String a = null;
        String sexy = Optional.ofNullable(a).orElse("sexy");
        System.out.println(sexy);

    }
}
