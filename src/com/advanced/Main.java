package com.advanced;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Zadanie 1.");

        Movie fnf = new Movie("Fast and Furious", "Some Director", "Action", 2000, 5, 17);
        Movie constantine = new Movie("Constantine", "Some Other Director", "Action", 1999, 1, 90);
        Movie fnfButSame = new Movie("Fast and Furious", "Some Director", "Action", 2000, 5, 17);
        Movie movieShortedConstructor = new Movie("Some title", "Fantasy", 2001);
        //set prizeCount to movieShortedContructor
        movieShortedConstructor.setPrizeCount(13);
        //set boxOffice ranking to movieShortedConstructor
        movieShortedConstructor.setBoxOfficeRanking(67);
        //display movieShorted..
        movieShortedConstructor.displayMovie();
        //declare string with constantine.toString and show
        String constantineToStr = constantine.toString();
        System.out.println(constantineToStr);
        //Compare fnf and fnfButSame
        boolean isFnfEqualtoFndButSame = fnf.equals(fnfButSame);
        System.out.println(isFnfEqualtoFndButSame);

        System.out.println("Zadanie 2: CSV...");

        MoviesList moviesList = new MoviesList();

        String[] csv = {
                "The Shawshank Redemption,Frank Darabont,Drama,1994,21,0",
                "The Godfather,Francis Ford Coppola,Crime,1972,29,0",
                "The Godfather: Part II,Francis Ford Coppola,Crime,1974,17,0"
        };

        for(String movie : csv) {
            String[] currentMovie = movie.split(",");
            Movie newMovie = new Movie(currentMovie[0], currentMovie[1], currentMovie[2],
                    Integer.parseInt(currentMovie[3]), Integer.parseInt(currentMovie[4]),
                    Integer.parseInt(currentMovie[5]));

            moviesList.addMovie(newMovie);
        }

        moviesList.displayList();

        ArrayList<Movie> results = moviesList.searchByTitle("The Godfather");
        System.out.println("Odnaleziono filmy:");
        System.out.println(results.toString());

        moviesList.searchByPhrase("Crime");
        moviesList.searchByPhrase("Frank Darabont");

    }
}
