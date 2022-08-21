package com.functionalJava.section7;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Integer a = 10;
        Optional<Integer> optional = Optional.of(a);

        //get > never use it. -> 굳이 옵셔널 쓸 이유가 없어짐
        Integer aBack = optional.get();
        System.out.println(aBack);

        Optional<Integer> emptyOptional = Optional.empty();
        // emptyOptional.get(); //NoSuchElementException!!

        //boolean isPresent
        Integer result = optional.isPresent()? optional.get() : 0;
        System.out.println(result);

        //orElse,
        Integer integer = optional.orElse(0);
        System.out.println(integer);
        Integer emptyInteger = emptyOptional.orElse(0);
        System.out.println(emptyInteger);

        //orElseGet(Supplier<? extends T>)
        Integer integer1 = emptyOptional.orElseGet(() -> 9);
        System.out.println(integer1);

        //orElseThrow
        emptyOptional.orElseThrow(IllegalArgumentException::new);

    }

}
