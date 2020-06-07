package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*int value = 10;
        NumberConverter numberConverter = new NumberConverter(value);

        System.out.println(numberConverter.toBinary());

        System.out.println(numberConverter.toHex());*/

        Notepad notepad = new Notepad();
        Scanner input = new Scanner(System.in);

        System.out.println("Program notatnik");

        char opcja;
        String text;
        int index = 0;

        /**
         * Seed...
         */
        notepad.addNote("Notatka1");
        notepad.addNote("Notatka2");

        do {
            System.out.println("Wybierz opcję z menu:");
            System.out.println("1. Dodaj notatke");
            System.out.println("2. Wypisz wszystkie notatki");
            System.out.println("3. Usun notatke");
            System.out.println("4. Wyswietl konkretna notatke");
            System.out.println("q - zakoncz");

            opcja = input.next().charAt(0);
            switch (opcja) {
                case '1':
                    System.out.println("Wpisz tektst notatki");
                    text = input.next();
                    notepad.addNote(text);
                    break;
                case '2':
                    System.out.println("Wszystkie notatki:");
                    notepad.list();
                    break;
                case '3':
                    System.out.println("Podaj indeks notatki do usunięcia");
                    index = input.nextInt();
                    notepad.delete(index);
                    break;
                case '4':
                    System.out.println("Podaj indeks notatki ktora chcesz wyswietlic");
                    index = input.nextInt();
                    notepad.printNote(index);
                    break;
                case 'q':
                    System.out.println("Bye");
                    return;
            }
        } while(opcja != 'q');


    }
}
