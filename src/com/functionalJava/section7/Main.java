package com.functionalJava.section7;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //ifPresent(Consumer)
        Optional<String> optional = Optional.of("Value");
        optional.ifPresent(System.out::println); //Value
        optional.ifPresent(val -> System.out.println(val + " is present")); //Value is present
        Optional.empty().ifPresent(System.out::println); //nothing happened

        //ifPresentOrElse(존재할 때 액션consumer, null일 때 액션runnable)
        optional.ifPresentOrElse(System.out::println, () -> System.out.println("Values is absent")); //Value
        Optional.empty().ifPresentOrElse(System.out::println, () -> System.out.println("value is absent")); //value is absent

        //stream : Optional의 value가 있는 애들만 시퀀셜스트림을 리턴함.
        Stream<String> stream = optional.stream();
        optional.stream().forEach(System.out::println); //Value
        Optional.empty().stream().forEach(System.out::println); //아무일 없음

        //or(Supplier) value있으면 value 그대로, 없으면, new Option을 반환
        //orElse의 경우 null일 때 다른 객체를 반환했으나, or의 경우 Optional을 반환한다/
        optional.or(() -> Optional.of("New Value")).ifPresent(System.out::println); //Value
        Optional.empty().or(() -> Optional.of("Alternative Value")).ifPresent(System.out::println); //Alternative Value.

        //equals(object)->
        //optional
        //either both are empty
        //or if the values in optionals are equal to each other via equals method
        System.out.println(optional.equals(Optional.of("Value"))); //true

        //hashcode
        System.out.println(Optional.empty().hashCode());  //0
        System.out.println(optional.hashCode()); //82420049

    }

}
