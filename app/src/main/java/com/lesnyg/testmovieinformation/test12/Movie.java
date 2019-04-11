package com.lesnyg.testmovieinformation.test12;

import java.io.Serializable;

public class Movie implements Serializable {
    private int movieImage;
    private String movieTitle;

    public Movie() {
    }

    public Movie(int movieImage, String movieTitle) {
        this.movieImage = movieImage;
        this.movieTitle = movieTitle;
    }

    public int getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(int movieImage) {
        this.movieImage = movieImage;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }
}
