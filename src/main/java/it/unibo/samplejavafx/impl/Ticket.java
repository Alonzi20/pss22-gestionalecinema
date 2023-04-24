package it.unibo.samplejavafx.impl;

import it.unibo.samplejavafx.api.TicketInterface;

public class Ticket implements TicketInterface{
    private static final double PREZZORIDOTTO = 5.5;
    private static final double PREZZOINTERO = 8.5;
    private int id=1;
    private boolean reduction;
    private double price;
    private Screening screening;

    public Ticket(Screening screening, Boolean reduction){
        this.id=id++;   //modifica dell'id da rivedere
        this.screening=screening; 
        this.reduction=reduction;
        if (reduction)
            this.price=PREZZORIDOTTO;
        else
            this.price=PREZZOINTERO;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public double getPrice() {
        return price;
    } 

    @Override
    public String getReduction() {
        if(this.reduction)
            return "ridotto";
        else
            return "intero";   
    } 

    public String getTitle(){
        return screening.getFilm();
    }

    public String getDate(){
        return screening.getDate();
    }

    public String getHour(){
        return screening.getHour();
    }

    public int getMovieTheater(){
        return screening.getMovieTheater();
    }
}
