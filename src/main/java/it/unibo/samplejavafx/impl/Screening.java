package it.unibo.samplejavafx.impl;

import java.util.ArrayList;

import it.unibo.samplejavafx.api.ScreeningInterface;

public class Screening implements ScreeningInterface{
    private int id;
    private String date;
    private String hour;
    private Film film;
    private MovieTheater movieTheater;
    private ArrayList<Seat> busySeats = new ArrayList<Seat>();

    public Screening(String date, String hour, Film film, MovieTheater movieTheater) {
        this.id=id++;
        this.date = date;
        this.hour = hour;
        this.film = film;
        this.movieTheater = movieTheater;
        this.busySeats = null;
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

    public boolean isEmpty(Seat checkedSeat) {
        if (busySeats.contains(checkedSeat))
            return false;
        else 
            return true;
    }

    public void updateBusySeats(Seat chosenSeat) {
        busySeats.add(chosenSeat);
    }

    @Override
    public void deleteScreening() {
        //method to be implemented later
    } 
}