package it.unibo.samplejavafx.api;

public interface ScreeningInterface {
    int getId();
    String getDate();
    String getHour();
    String getFilm();
    int getMovieTheater();

    void deleteScreening();
}
