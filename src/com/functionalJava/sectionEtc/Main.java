package com.functionalJava.sectionEtc;

import com.functionalJava.sectionEtc.Person.Gender;

import java.util.function.Predicate;

public class Main {
    public static void main(String ... args){
        Person sample = new Person.Builder().with((bldr) -> {
            bldr.gender = Gender.FEMALE;
            bldr.age = 27;
        }).build();

        //without Predicate<T>
        if(sample.getGender().equals(Gender.FEMALE) || sample.getGender().equals(Gender.FEMALE) && sample.getAge() >= 20){
            System.out.println("OK");
            return;
        }
        System.out.println("NG");

        //with Predicate<T>
        Predicate<Person> isMale = person -> person.getGender().equals(Gender.MALE);
        Predicate<Person> isFemale = person -> person.getGender().equals(Gender.FEMALE);
        Predicate<Person> isAdult = person -> person.getAge() >= 20;
        Predicate<Person> criteria = isMale.or(isFemale.and(isAdult));

        if(criteria.test(sample)){
            System.out.println("OK");
            return;
        }
        System.out.println("NG");
    }
}
