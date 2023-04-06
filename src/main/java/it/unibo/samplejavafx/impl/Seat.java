package it.unibo.samplejavafx.impl;

import it.unibo.samplejavafx.api.SeatInterface;

public class Seat implements SeatInterface{
    private int number;
    private char line;
    private MovieTheater movieTheater;
    
    public Seat(int number, char line, MovieTheater movieTheater) {
        this.number = number;
        this.line = line;
        this.movieTheater = movieTheater;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public char getLine() {
        return line;
    }
    
}
