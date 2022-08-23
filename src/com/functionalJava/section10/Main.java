package com.functionalJava.section10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        List<Book> popularHorrorBooks = new ArrayList<>();

        books.add(new Book("cal", "who", "Horror", 4));
        books.add(new Book("hoho", "wh", "Comic", 2));
        books.add(new Book("hey", "pou", "horror", 9));
        books.add(new Book("shit", "steve", "horror", 1));

        // for(Book b : books){
        //     if(b.getGenre().equalsIgnoreCase("horror") && b.getRating() > 3){
        //         popularHorrorBooks.add(b);
        //     }
        // }
        //Stream PipeLine = Source + Zero or more Intermediate Operations + A Terminal Operations.
        books.parallelStream().filter(b -> b.getGenre().equalsIgnoreCase("HORROR")).toList();
        books.stream().parallel().filter(b -> b.getGenre().equalsIgnoreCase("horror") && b.getRating() > 3).forEach(popularHorrorBooks::add);
        List<Book> horror = books.stream()
            .filter(b -> b.getGenre().equalsIgnoreCase("horror") && b.getRating() > 3)
            .toList();
        System.out.println(popularHorrorBooks);
        System.out.println(horror);

        Stream<Book> stream = books.stream();
        Stream<Book> horrorStream = stream.filter(bk -> bk.getGenre().equalsIgnoreCase("Horror"));
        Stream<Book> popHorrorStream = horrorStream.filter(bk -> bk.getRating() > 3);
        List<Book> collect = popHorrorStream.collect(Collectors.toList());

        System.out.println(collect);


    }

}
