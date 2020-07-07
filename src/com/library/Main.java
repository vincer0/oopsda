package com.library;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter").withPrice(50.00).withReleaseDate(2002).withGenre(Genre.FANTASY);
        Book book2 = new Book("The Godfather").withPrice(254.00).withReleaseDate(1999).withGenre(Genre.DRAMA);

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);

        library.getList();

        boolean result = library.searchBookByTitle("The Godfather");
        System.out.println(result);

        library.getFantasy();
    }
}
