package it.unibo.samplejavafx.impl;

import it.unibo.samplejavafx.api.ScreeningInterface;

public class Screening implements ScreeningInterface{
    private int id;
    private String date;
    private String hour;
    private Film film;
    private MovieTheater movieTheater;

    public Screening(String date, String hour, Film film, MovieTheater movieTheater) {
        this.id=id++;
        this.date = date;
        this.hour = hour;
        this.film = film;
        this.movieTheater = movieTheater;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public String getHour() {
        return hour;
    }

    @Override
    public String getFilm() {
        return film.getTitle();
    }

    @Override
    public int getMovieTheater() {
        return movieTheater.getNumber();
    }

    @Override
    public void deleteScreening() {
        //method to be implemented later
    } 
}