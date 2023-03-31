package it.unibo.samplejavafx;

import it.unibo.samplejavafx.api.ActorInterface;
import it.unibo.samplejavafx.api.ClientInterface;
import it.unibo.samplejavafx.api.FilmInterface;
import it.unibo.samplejavafx.api.MovieTheaterInterface;
import it.unibo.samplejavafx.api.ScreeningInterface;
import it.unibo.samplejavafx.api.SeatInterface;
import it.unibo.samplejavafx.api.TicketInterface;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class TestCinema {
    @Test
    public void testActor(){
        ActorInterface gino = new ActorInterface("Gino", "Pino");
        Assertions.assertEquals("Gino", gino.getName());
        Assertions.assertEquals("Pino", gino.getSurname());
    }
    @Test
    public void testClient(){
        ClientInterface gino = new ClientInterface(1, "Gino", "Pino", "gino.pino@gmail.com");
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
        FilmInterface film = new FilmInterface(1, "titolo", "regista", "trama", "durata", "genere", 2010, "linkCopertina");
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
        MovieTheaterInterface sala = new MovieTheaterInterface(5);
        Assertions.assertEquals(5, sala.getNumber());
    }
    @Test
    public void testScreening(){
        ScreeningInterface proiezione = new ScreeningInterface(1, "data", "ora");
        Assertions.assertEquals(1, proiezione.getId());
        Assertions.assertEquals("data", proiezione.getDate());
        Assertions.assertEquals("ora", proiezione.getHour());
        proiezione.deleteScreening();
        Assertions.assertNull(proiezione.getId());
    }
    @Test
    public void testSeat(){
        SeatInterface posto = new SeatInterface(1, "A");
        Assertions.assertEquals(1, posto.getNumber());
        Assertions.assertEquals("A", posto.getLine());
    }
    @Test
    public void testTicket(){
        TicketInterface biglietto = new TicketInterface(1, 9.99);
        Assertions.assertEquals(1, biglietto.getId());
        Assertions.assertEquals("A", biglietto.getPrice());
    }
}
