package com.example.mvcarchitectureimplementation.pojo;

public class MoviesModel {
    int movieId;
    String name;
    int moviePrice;

    public MoviesModel(int movieId, String movieName, int moviePrice) {
        this.movieId = movieId;
        this.name = movieName;
        this.moviePrice = moviePrice;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(int moviePrice) {
        this.moviePrice = moviePrice;
    }
}
