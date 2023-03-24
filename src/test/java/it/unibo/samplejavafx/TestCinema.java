package it.unibo.samplejavafx;

import it.unibo.samplejavafx.api.Actor;
import it.unibo.samplejavafx.api.Client;
import it.unibo.samplejavafx.api.Film;
import it.unibo.samplejavafx.api.MovieTheater;
import it.unibo.samplejavafx.api.Screening;
import it.unibo.samplejavafx.api.Seat;
import it.unibo.samplejavafx.api.Ticket;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class TestCinema {
    @Test
    public void testActor(){
        Actor gino = new Actor("Gino", "Pino");
        Assertions.assertEquals("Gino", gino.getName());
        Assertions.assertEquals("Pino", gino.getSurname());
    }
    @Test
    public void testClient(){
        Client gino = new Client(1, "Gino", "Pino", "gino.pino@gmail.com");
        gino.setId(2);
        gino.setName("Pippo");
        gino.setSurname("Franco");
        gino.setEmail("pippo.franco@gmail.com");
        Assertions.assertEquals(2, gino.getId());
        Assertions.assertEquals("Pippo", gino.getName());
        Assertions.assertEquals("Franco", gino.getSurname());
        Assertions.assertEquals("pippo.franco@gmail.com", gino.getEmail());
        gino.deleteClient();
        Assertions.assertNull(gino.getId());
    }
    @Test
    public void testFilm(){
        Film film = new Film(1, "titolo", "regista", "trama", "durata", "genere", 2010, "linkCopertina");
        Assertions.assertEquals(2, film.getId());
        Assertions.assertEquals("titolo", film.getTitle());
        Assertions.assertEquals("regista", film.getDirector());
        Assertions.assertEquals("durata", film.getLenght());
        Assertions.assertEquals("genere", film.getGenre());        
        Assertions.assertEquals(2010, film.getYear());        
        Assertions.assertEquals("linkCopertina", film.getCover());
        film.deleteFilm();
        Assertions.assertNull(film.getId());
    }
    @Test
    public void testMovieTheater(){
        MovieTheater sala = new MovieTheater(5);
        Assertions.assertEquals(5, sala.getNumber());
    }
    @Test
    public void testScreening(){
        Screening proiezione = new Screening(1, "data", "ora");
        Assertions.assertEquals(1, proiezione.getId());
        Assertions.assertEquals("data", proiezione.getDate());
        Assertions.assertEquals("ora", proiezione.getHour());
        proiezione.deleteScreening();
        Assertions.assertNull(proiezione.getId());
    }
    @Test
    public void testSeat(){
        Seat posto = new Seat(1, "A");
        Assertions.assertEquals(1, posto.getNumber());
        Assertions.assertEquals("A", posto.getLine());
    }
    @Test
    public void testTicket(){
        Ticket biglietto = new Ticket(1, 9.99);
        Assertions.assertEquals(1, biglietto.getId());
        Assertions.assertEquals("A", biglietto.getPrice());
    }
}
