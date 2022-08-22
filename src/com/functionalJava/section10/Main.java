package com.functionalJava.section10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        List<Book> popularHorrorBooks = new ArrayList<>();

        books.add(new Book("cal", "who", "Horror", 4));

        // for(Book b : books){
        //     if(b.getGenre().equalsIgnoreCase("horror") && b.getRating() > 3){
        //         popularHorrorBooks.add(b);
        //     }
        // }

        books.stream().filter(b -> b.getGenre().equalsIgnoreCase("horror") && b.getRating() > 3).forEach(popularHorrorBooks::add);
        List<Book> horror = books.stream()
            .filter(b -> b.getGenre().equalsIgnoreCase("horror") && b.getRating() > 3)
            .toList();
        System.out.println(popularHorrorBooks);
        System.out.println(horror);
    }

}
