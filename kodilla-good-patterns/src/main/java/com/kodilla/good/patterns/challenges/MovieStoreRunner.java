package com.kodilla.good.patterns.challenges;


public class MovieStoreRunner {
    public static void main(String[] args) {

        String result;
        result = MovieStore.getMovies().entrySet().stream().map(e -> e.getValue()).map(e -> e.toString()).reduce("", String::concat);

        result = result.replace("]", " ");
        result = result.replace("[", "");
        result = result.replace(",", "!");
        result = result.replace(" ", "!");
        result = result.replace("!!", "!");
        result = result.replace("Żelazny!", "Żelazny ");
        result = result.replace("Iron!", "Iron ");


        System.out.println(result);


    }

}
