package com.advanced;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        /**
         * Zadanie 1
         */
        /*System.out.println("Zadanie 1.");

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

        *//**
         * Zadanie 2
         *//*
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
        moviesList.searchByPhrase("Frank Darabont");*/

        /**
         * Zadania Point2D
         *
         */
        System.out.println("Zadanie Point2D");
        Point2D point2d = new Point2D();
        System.out.println(Arrays.toString(point2d.getXY()));
        System.out.println(point2d.toString());

        Point2D aPoint2d = new Point2D(2.23f, 3.34f);
        System.out.println(Arrays.toString(aPoint2d.getXY()));
        System.out.println(aPoint2d.toString());
        System.out.println();

        /**
         * Zadanie Point3D
         */
        System.out.println("Zadanie Point3D");
        Point3D point3D = new Point3D(3.12f, 4.56f, 7.6f);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(String.format("X: %.2f, Y: %.2f, Z: %.2f", point3D.getX(), point3D.getY(), point3D.getZ()));
        System.out.println(point3D.toString());
        point3D.setXY(3f, 0.21f);
        System.out.println(point3D.toString());
        point3D.setXYZ(12.21f, 9.57f, 7.54f);
        System.out.println(point3D.toString());
        System.out.println();

        /**
         * Zadanie Shape
         */
        System.out.println("Zadanie Shape");
        Shape dummyShape = new Shape();
        System.out.println(dummyShape.toString());

        Shape shape = new Shape("Red" , true);
        System.out.println(shape.toString());
        System.out.println();

        /**
         * Zadanie Circle
         */
        System.out.println("Zadanie Circle");
        Circle dummyCircle = new Circle();
        System.out.println(dummyCircle.toString());

        Circle circle = new Circle("Blue", true, 2.0f);
        System.out.println(circle.toString());
        System.out.println(String.format("Area of circle: %.2f", circle.getArea()));
        System.out.println(String.format("Perimeter of circle: %.2f", circle.getPerimeter()));
        System.out.println();

        /**
         * Zadanie Rectangle
         */
        System.out.println("Zadanie Rectangle");
        Rectangle dummyRectangle = new Rectangle();
        System.out.println(dummyRectangle.toString());

        Rectangle rectangle = new Rectangle("Yellow", true, 2.0f, 4.0f);
        System.out.println(rectangle.toString());
        System.out.println(String.format("Area of rectangle: %.2f", rectangle.getArea()));
        System.out.println(String.format("Perimeter of rectangle: %.2f", rectangle.getPerimeter()));
        System.out.println();

        /**
         * Zadanie Line
         */
        System.out.println("Zadanie Line");
        Point2D p1 = new Point2D(0,0);
        Point2D p2 = new Point2D(2,2);
        Line line = new Line(p1, p2);
        double lengthOfLine = line.getLength();
        System.out.println("Length of line: " + lengthOfLine);
        Point2D middlePoint = line.getMiddlePoint();
        System.out.println(String.format("Middle point of line: %s", middlePoint.toString()));
        System.out.println();

        /**
         * Zadanie Square
         */
        System.out.println("Zadanie Square");
        Square square = new Square("White", true, 5);
        System.out.println(square.toString());
        System.out.println();
    }
}
