package com.iftm.moviecatalogservice.models;

public class Movie {

	private String movieId;
	private String name;
    private String description;

	public Movie() {}
	
	public Movie(String movieId, String nome, String description) {
		this.movieId = movieId;
		this.name = nome;
        this.description = description;
	}
	
	public String getMovieId() {return movieId;}
	public void setMovieId(String movieId) {this.movieId = movieId;}
	public String getName() {return name;}
	public void setName(String nome) {this.name = nome;}
	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}
	
}