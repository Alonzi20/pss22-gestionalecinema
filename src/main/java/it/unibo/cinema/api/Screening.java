package it.unibo.cinema.api;

public interface Screening {
    int getId();
    String getDate();
    String getHour();

    void deleteScreening(int id);
}
