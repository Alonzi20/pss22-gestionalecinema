package it.unibo.samplejavafx.api;

public interface Film {
    int getId();
    String getTitle();
    String getDirector();
    String getPlot();
    String getLenght();
    String getGenre();
    int getYear();
    String getCover();

    void deleteFilm();
}
