package com.functionalJava.section10;

public class Book {
    private String name;
    private String author;
    private String genre;
    private int rating;

    public Book(String name, String author, String genre, int rating) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Book{"
            + "name='"
            + name
            + '\''
            + ", author='"
            + author
            + '\''
            + ", genre='"
            + genre
            + '\''
            + ", rating="
            + rating
            + '}';
    }
}
