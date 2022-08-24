package com.functionalJava.section10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("cal", "who", "Horror", 4.425));
        books.add(new Book("hoho", "wh", "Comic", 2.10));
        books.add(new Book("hey", "pou", "horror", 4.25));
        books.add(new Book("holy", "steve", "horror", 1));
        Book a = new Book("holy", "crap", "my", 3);
        Book b = new Book("holy", "sg", "g", 9);
        books.add(a);
        books.add(b);
        System.out.println(a.equals(b));
        System.out.println("hhhhhhhhhhhhhh0");
        books.stream().forEach(System.out::println);
        System.out.println("hhhhhhhhhhhhhh0");
        books.stream().distinct().forEach(System.out::println);



        // Stream<Book> horror = books.stream()
        //     .filter(b -> b.getGenre().equalsIgnoreCase("HORROR"))
        //     .peek(b -> System.out.println("filtered: "  + b.getName()))
        //     .filter(b -> b.getRating() > 3)
        //     .peek(b -> System.out.println(b.getName()));
        //
        // System.out.println("**filtering is done**");
        // horror.toList();

        Stream<Book> stream = books.stream();
        Stream<Double> doubleStream1 = stream.map(Book::getRating);
        DoubleStream doubleStream = doubleStream1.mapToDouble(rating -> rating);
        OptionalDouble average = doubleStream.average();
        System.out.println(average.isPresent()? average.getAsDouble() : 0);
        //간단히 표현
        books.stream().mapToDouble(Book::getRating).average().ifPresent(System.out::println);


    }

}
