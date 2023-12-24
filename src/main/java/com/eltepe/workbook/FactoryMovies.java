package com.eltepe.workbook;

import java.util.ArrayList;
import java.util.List;

public class FactoryMovies {
    public static List<Movies> moviesTransfer = new ArrayList<>();

    public static List<Movies> wrapMovies(String[] titles, String[] episodes, String[] ratings){

        if (titles.length == episodes.length && titles.length == ratings.length) {
            for (int i = 0; i < titles.length; i++) {
                moviesTransfer.add(new Movies(titles[i], episodes[i], ratings[i]));
            }
        }

        return moviesTransfer;
    }

    public static void addMovie(String title, String episode, String rating){
        moviesTransfer.add(new Movies(title, episode, rating));
    }
}
