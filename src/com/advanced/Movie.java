package com.advanced;

public class Movie {
    String title;
    String director;
    String genre;
    int releaseDate;
    int prizeCount;
    int boxOfficeRanking;

    Movie(String title, String director, String genre, int releaseDate, int prizeCount, int boxOfficeRanking) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.prizeCount = prizeCount;
        this.boxOfficeRanking = boxOfficeRanking;
    }

    Movie(String title, String genre, int releaseDate) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = "Nie podano";
        this.prizeCount = -1;
        this.boxOfficeRanking = -1;
    }

    public void displayMovie() {
        System.out.println(String.format("Tytuł: %s, Reżyser: %s, Gatunek: %s, Rok wydania: %d, Ilosc nagród: %d," +
                " Ranking Box Office: %d", title, director,genre,releaseDate, prizeCount,boxOfficeRanking));
    }

    public void setPrizeCount(int prizeCount) {
        this.prizeCount = prizeCount;
    }

    public void setBoxOfficeRanking(int boxOfficeRanking) {
        this.boxOfficeRanking = boxOfficeRanking;
    }

    public String toString() {
        return String.format("Tytuł: %s, Reżyser: %s, Gatunek: %s, Rok wydania: %d, Ilosc nagród: %d," +
                " Ranking Box Office: %d", title, director,genre,releaseDate, prizeCount,boxOfficeRanking);
    }

    /**
     * If param m has same title and release date it has to be same movie...
     * @param m Movie to be compared
     * @return boolean
     */
    public boolean equals(Movie m) {
        return title.equals(m.title) && releaseDate == m.releaseDate;
    }
}
