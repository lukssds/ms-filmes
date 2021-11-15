package com.iftm.movieinfoservice.models;

public class Movie {

    private String movieId;
    private String name;

    public Movie(String movieId, String nome) {
        super();
        this.movieId = movieId;
        this.name = nome;
    }

    public Movie() {super();}

    public String getMovieId() {return movieId;}
    public void setMovieId(String movieId) {this.movieId = movieId;}
    public String getName() {return name;}
    public void setName(String nome) {this.name = nome;}



}