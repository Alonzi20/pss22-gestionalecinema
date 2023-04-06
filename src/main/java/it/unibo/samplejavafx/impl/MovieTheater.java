package it.unibo.samplejavafx.impl;

import it.unibo.samplejavafx.api.MovieTheaterInterface;

public class MovieTheater implements MovieTheaterInterface{
    private int number;

    public MovieTheater(int number) {
        this.number = number;
    }

    @Override
    public int getNumber() {
        return number;
    }
}
