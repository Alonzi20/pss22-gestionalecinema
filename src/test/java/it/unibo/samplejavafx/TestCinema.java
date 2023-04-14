package it.unibo.samplejavafx;

import it.unibo.samplejavafx.api.ActorInterface;
import it.unibo.samplejavafx.api.ClientInterface;
import it.unibo.samplejavafx.api.FilmInterface;
import it.unibo.samplejavafx.api.MovieTheaterInterface;
import it.unibo.samplejavafx.api.ScreeningInterface;
import it.unibo.samplejavafx.api.SeatInterface;
import it.unibo.samplejavafx.api.TicketInterface;
import it.unibo.samplejavafx.impl.Client;
import it.unibo.samplejavafx.impl.MovieTheater;
import it.unibo.samplejavafx.impl.Screening;
import it.unibo.samplejavafx.impl.Seat;
import it.unibo.samplejavafx.impl.Ticket;

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
        Client gino = new Client("Gino", "Pino", "gino.pino@gmail.com");
        gino.setName("Pippo");
        gino.setSurname("Franco");
        gino.setEmail("pippo.franco@gmail.com");
        Assertions.assertEquals(1, gino.getId());
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
        MovieTheater sala = new MovieTheater(5);
        Assertions.assertEquals(5, sala.getNumber());
    }
    @Test
    public void testScreening(){
        MovieTheater sala = new MovieTheater(5);
        Screening proiezione = new Screening("data", "ora", film, sala);
        Assertions.assertEquals(1, proiezione.getId());
        Assertions.assertEquals("data", proiezione.getDate());
        Assertions.assertEquals("ora", proiezione.getHour());
        proiezione.deleteScreening();
        Assertions.assertNull(proiezione.getId());
    }
    @Test
    public void testSeat(){
        MovieTheater sala = new MovieTheater(5);
        Seat posto = new Seat(1, 'A', sala);
        Assertions.assertEquals(1, posto.getNumber());
        Assertions.assertEquals('A', posto.getLine());
    }
    @Test
    public void testTicket(){
        Ticket bigliettointero = new Ticket(1, false);
        Ticket bigliettoridotto = new Ticket(1, true);
        Assertions.assertEquals(1, bigliettointero.getId());
        Assertions.assertEquals(8.5, bigliettointero.getTitle());
        Assertions.assertEquals("data", bigliettointero.getDate());
        Assertions.assertEquals("ora", bigliettointero.getHour());
        Assertions.assertEquals(1, bigliettointero.getMovieTheater());
        Assertions.assertEquals(5.5, bigliettoridotto.getPrice());
    }
}
