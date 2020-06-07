package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Notepad {
    private ArrayList<String> list = new ArrayList<String>();

    public Notepad() {
    }

    public void addNote(String note) {
        list.add(note);
    }

    public void printNote(int index) {
        try {
            System.out.println(list.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Notatka o podanym indeksie nie istnieje");
        }
    }

    public void list() {
        System.out.println(Arrays.toString(list.toArray()));
    }

    public void delete(int index) {
        try {
            System.out.println(list.remove(index));
            System.out.println("Usunięto notatke o indeksie: " + index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Notatka o podanym indeksie nie istnieje");
        }
    }

}
