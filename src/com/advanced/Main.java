package com.advanced;

public class Main {
    public static void main(String[] args) {
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

    }
}
