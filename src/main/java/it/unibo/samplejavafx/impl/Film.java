package it.unibo.samplejavafx.impl;

import it.unibo.samplejavafx.api.FilmInterface;
import com.omertron.omdbapi.OMDBException;
import com.omertron.omdbapi.OmdbApi;
import com.omertron.omdbapi.tools.OmdbBuilder;


import static java.lang.System.out;

public class Film implements FilmInterface{
    private String genre;
    private String title;
    private String director;
    private String length;
    private String plot;
    private int year;
    private String cover;
    private int id;


    @Override
    public String getGenre(){
        return genre;
    }

    @Override
    public String getTitle(){
        return title;
    }

    @Override
    public String getDirector(){
        return director;
    }

    @Override
    public String getLenght(){
        return length;
    }

    @Override
    public String getPlot(){
        return plot;
    }

    @Override 
    public int getId(){
        return id;
    }

    @Override
    public void deleteFilm(){
    }

    @Override
    public String getCover(){
        return cover;
    }

    @Override
    public int getYear(){
        return year;
    }
    
}
