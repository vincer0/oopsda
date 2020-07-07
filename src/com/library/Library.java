package com.library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> list;

    Library() {
        list = new ArrayList<>();
    }

    public void addBook(Book book) {
        System.out.println("Dodaję: " + book.toString());
        list.add(book);
    }

    public void getList() {
        System.out.println(list);
    }

    public void getFantasy() {
        ArrayList<Book> fantasyList = new ArrayList<>();
        for(Book book : list) {
            if(book.getGenre() == Genre.FANTASY) {
                fantasyList.add(book);
            }
        }
        System.out.println(fantasyList);
    }

    public boolean searchBookByTitle(String title) {
        for(Book book : list) {
            if(book.getTitle() == title) {
                return true;
            }
        }
        return false;
    }
}
