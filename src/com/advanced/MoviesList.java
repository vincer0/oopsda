package com.advanced;

import java.util.ArrayList;

public class MoviesList {
    public ArrayList<Movie> moviesList = new ArrayList<>();

    public void addMovie(Movie item) {
        moviesList.add(item);
    }

    public void displayList() {
        for(Movie movie : moviesList) {
            movie.displayMovie();
        }
    }

    public ArrayList<Movie> searchByTitle(String title) {
        System.out.println("Szukam po tytule: "+title);
        ArrayList<Movie> searchResults = new ArrayList<>();
        for (Movie movie : moviesList) {
            if(movie.title.equals(title)) {
                searchResults.add(movie);
            }
        }
        return searchResults;
    }
}
