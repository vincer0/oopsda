package com.library;

public class Book {
    private String title;
    private double price;
    private int releaseDate;
    private Genre genre;

    Book(String title) {
        this.title = title;
    }

    public Book withPrice(double price) {
        this.price = price;
        return this;
    }

    public Book withReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public Book withGenre(Genre genre) {
        this.genre = genre;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return String.format("Tytuł: %s, cena: %.2f, rok wydania: %d, gatunek: %s", getTitle(), getPrice(), getReleaseDate(), getGenre());
    }
}
