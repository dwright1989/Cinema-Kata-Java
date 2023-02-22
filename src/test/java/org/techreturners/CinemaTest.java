package org.techreturners;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;



public class CinemaTest {

    List<Seat> seats;

    @BeforeEach
    public void setUp(){
        seats = new ArrayList<Seat>();
        seats.add(new Seat('A', 1, true));
        seats.add(new Seat('A', 2, true));
        seats.add(new Seat('A', 3, false));
        seats.add(new Seat('A', 4, true));
        seats.add(new Seat('A', 5, true));
        seats.add(new Seat('B', 1, true));
        seats.add(new Seat('B', 2, true));
        seats.add(new Seat('B', 3, true));
        seats.add(new Seat('B', 4, true));
        seats.add(new Seat('B', 5, true));
        seats.add(new Seat('C', 1, true));
        seats.add(new Seat('C', 2, false));
        seats.add(new Seat('C', 3, true));
        seats.add(new Seat('C', 4, true));
        seats.add(new Seat('C', 5, true));
    }

    @Test
    public void canCreateCinemaObjectWithEmptySeatArray(){
        Cinema cinema = new Cinema("Cinnamon", new ArrayList<>());
        assertNotNull(cinema);
    }

    @Test
    public void canCreateCinemaObjectWithFilledSeatArray(){
        Cinema cinema = new Cinema("Cinnamon", seats);
        assertNotNull(cinema.getSeats());
    }

    @Test
    public void canBookOneSeatWhenCinemaEmpty(){
        List<Seat> seats = new ArrayList<Seat>();
        seats.add(new Seat('A', 1, true));
        seats.add(new Seat('A', 2, true));
        seats.add(new Seat('A', 3, true));
        seats.add(new Seat('A', 4, true));
        seats.add(new Seat('A', 5, true));
        seats.add(new Seat('B', 1, true));
        seats.add(new Seat('B', 2, true));
        seats.add(new Seat('B', 3, true));
        seats.add(new Seat('B', 4, true));
        seats.add(new Seat('B', 5, true));
        seats.add(new Seat('C', 1, true));
        seats.add(new Seat('C', 2, true));
        seats.add(new Seat('C', 3, true));
        seats.add(new Seat('C', 4, true));
        seats.add(new Seat('C', 5, true));
        Cinema cinema = new Cinema("Cinnamon", seats);
        List<Seat> bookedSeats = cinema.bookTickets(1);
        assertEquals(bookedSeats.size(), 1);
        assertEquals(bookedSeats.get(0), seats.get(0));
        assertFalse(seats.get(0).isAvailable());
    }

    @Test
    public void canBookOneSeatWhenFirstSeatTaken(){
        List<Seat> seats = new ArrayList<Seat>();
        seats.add(new Seat('A', 1, false));
        seats.add(new Seat('A', 2, true));
        seats.add(new Seat('A', 3, true));
        seats.add(new Seat('A', 4, true));
        seats.add(new Seat('A', 5, true));
        seats.add(new Seat('B', 1, true));
        seats.add(new Seat('B', 2, true));
        seats.add(new Seat('B', 3, true));
        seats.add(new Seat('B', 4, true));
        seats.add(new Seat('B', 5, true));
        seats.add(new Seat('C', 1, true));
        seats.add(new Seat('C', 2, true));
        seats.add(new Seat('C', 3, true));
        seats.add(new Seat('C', 4, true));
        seats.add(new Seat('C', 5, true));
        Cinema cinema = new Cinema("Cinnamon", seats);
        List<Seat> bookedSeats = cinema.bookTickets(1);
        assertEquals(bookedSeats.size(), 1);
        assertEquals(bookedSeats.get(0), seats.get(1));
        assertFalse(seats.get(1).isAvailable());
    }

    @Test
    public void canBookOneSeatWhenFirstRowTaken(){
        List<Seat> seats = new ArrayList<Seat>();
        seats.add(new Seat('A', 1, false));
        seats.add(new Seat('A', 2, false));
        seats.add(new Seat('A', 3, false));
        seats.add(new Seat('A', 4, false));
        seats.add(new Seat('A', 5, false));
        seats.add(new Seat('B', 1, true));
        seats.add(new Seat('B', 2, true));
        seats.add(new Seat('B', 3, true));
        seats.add(new Seat('B', 4, true));
        seats.add(new Seat('B', 5, true));
        seats.add(new Seat('C', 1, true));
        seats.add(new Seat('C', 2, true));
        seats.add(new Seat('C', 3, true));
        seats.add(new Seat('C', 4, true));
        seats.add(new Seat('C', 5, true));
        Cinema cinema = new Cinema("Cinnamon", seats);
        List<Seat> bookedSeats = cinema.bookTickets(1);
        assertEquals(bookedSeats.size(), 1);
        assertEquals(bookedSeats.get(0), seats.get(5));
        assertFalse(seats.get(5).isAvailable());
    }

    @Test
    public void cannotBookIfNoSeats(){
        List<Seat> seats = new ArrayList<Seat>();
        seats.add(new Seat('A', 1, false));
        seats.add(new Seat('A', 2, false));
        seats.add(new Seat('A', 3, false));
        seats.add(new Seat('A', 4, false));
        seats.add(new Seat('A', 5, false));
        seats.add(new Seat('B', 1, false));
        seats.add(new Seat('B', 2, false));
        seats.add(new Seat('B', 3, false));
        seats.add(new Seat('B', 4, false));
        seats.add(new Seat('B', 5, false));
        seats.add(new Seat('C', 1, false));
        seats.add(new Seat('C', 2, false));
        seats.add(new Seat('C', 3, false));
        seats.add(new Seat('C', 4, false));
        seats.add(new Seat('C', 5, false));
        Cinema cinema = new Cinema("Cinnamon", seats);
        List<Seat> bookedSeats = cinema.bookTickets(1);
        assertEquals(bookedSeats.size(), 0);
    }

    @Test
    public void canBookTwoSeatsIfFullCinemaAvailable(){
        List<Seat> seats = new ArrayList<Seat>();
        seats.add(new Seat('A', 1, true));
        seats.add(new Seat('A', 2, true));
        seats.add(new Seat('A', 3, true));
        seats.add(new Seat('A', 4, true));
        seats.add(new Seat('A', 5, true));
        seats.add(new Seat('B', 1, true));
        seats.add(new Seat('B', 2, true));
        seats.add(new Seat('B', 3, true));
        seats.add(new Seat('B', 4, true));
        seats.add(new Seat('B', 5, true));
        seats.add(new Seat('C', 1, true));
        seats.add(new Seat('C', 2, true));
        seats.add(new Seat('C', 3, true));
        seats.add(new Seat('C', 4, true));
        seats.add(new Seat('C', 5, true));
        Cinema cinema = new Cinema("Cinnamon", seats);
        List<Seat> bookedSeats = cinema.bookTickets(2);
        assertEquals(bookedSeats.size(), 2);
        assertEquals(bookedSeats.get(0), seats.get(0));
        assertEquals(bookedSeats.get(1), seats.get(1));
        assertFalse(seats.get(0).isAvailable());
        assertFalse(seats.get(1).isAvailable());
    }

    @Test
    public void cannotBookTwoTicketsOnSeparateRows(){
        List<Seat> seats = new ArrayList<Seat>();
        seats.add(new Seat('A', 1, false));
        seats.add(new Seat('A', 2, false));
        seats.add(new Seat('A', 3, false));
        seats.add(new Seat('A', 4, false));
        seats.add(new Seat('A', 5, true));
        seats.add(new Seat('B', 1, true));
        seats.add(new Seat('B', 2, true));
        seats.add(new Seat('B', 3, true));
        seats.add(new Seat('B', 4, true));
        seats.add(new Seat('B', 5, true));
        seats.add(new Seat('C', 1, true));
        seats.add(new Seat('C', 2, true));
        seats.add(new Seat('C', 3, true));
        seats.add(new Seat('C', 4, true));
        seats.add(new Seat('C', 5, true));
        Cinema cinema = new Cinema("Cinnamon", seats);
        List<Seat> bookedSeats = cinema.bookTickets(2);
        assertEquals(bookedSeats.size(), 2);
        assertEquals(bookedSeats.get(0), seats.get(5));
        assertEquals(bookedSeats.get(1), seats.get(6));
        assertTrue(seats.get(4).isAvailable());
        assertFalse(seats.get(5).isAvailable());
        assertFalse(seats.get(6).isAvailable());

    }


    @Test
    public void cannotBookWhenLastTwoSeatsSeparatedOnSameRow(){
        List<Seat> seats = new ArrayList<Seat>();
        seats.add(new Seat('A', 1, false));
        seats.add(new Seat('A', 2, true));
        seats.add(new Seat('A', 3, false));
        seats.add(new Seat('A', 4, false));
        seats.add(new Seat('A', 5, true));
        seats.add(new Seat('B', 1, false));
        seats.add(new Seat('B', 2, false));
        seats.add(new Seat('B', 3, false));
        seats.add(new Seat('B', 4, false));
        seats.add(new Seat('B', 5, false));
        seats.add(new Seat('C', 1, false));
        seats.add(new Seat('C', 2, false));
        seats.add(new Seat('C', 3, false));
        seats.add(new Seat('C', 4, false));
        seats.add(new Seat('C', 5, false));
        Cinema cinema = new Cinema("Cinnamon", seats);
        List<Seat> bookedSeats = cinema.bookTickets(2);
        assertEquals(bookedSeats.size(), 0);
        assertTrue(seats.get(1).isAvailable());
        assertTrue(seats.get(4).isAvailable());
    }


    @Test
    public void cannotBookWhenLastTwoSeatsSeparatedOnDifferentRows() {
        List<Seat> seats = new ArrayList<Seat>();
        seats.add(new Seat('A', 1, false));
        seats.add(new Seat('A', 2, true));
        seats.add(new Seat('A', 3, false));
        seats.add(new Seat('A', 4, false));
        seats.add(new Seat('A', 5, false));
        seats.add(new Seat('B', 1, false));
        seats.add(new Seat('B', 2, false));
        seats.add(new Seat('B', 3, false));
        seats.add(new Seat('B', 4, false));
        seats.add(new Seat('B', 5, false));
        seats.add(new Seat('C', 1, false));
        seats.add(new Seat('C', 2, false));
        seats.add(new Seat('C', 3, true));
        seats.add(new Seat('C', 4, false));
        seats.add(new Seat('C', 5, false));
        Cinema cinema = new Cinema("Cinnamon", seats);
        List<Seat> bookedSeats = cinema.bookTickets(2);
        assertEquals(bookedSeats.size(), 0);
        assertTrue(seats.get(1).isAvailable());
        assertTrue(seats.get(12).isAvailable());
    }




    @Test
    public void canBookThreeSeatsIfFullCinemaAvailable(){
        List<Seat> seats = new ArrayList<Seat>();
        seats.add(new Seat('A', 1, true));
        seats.add(new Seat('A', 2, true));
        seats.add(new Seat('A', 3, true));
        seats.add(new Seat('A', 4, true));
        seats.add(new Seat('A', 5, true));
        seats.add(new Seat('B', 1, true));
        seats.add(new Seat('B', 2, true));
        seats.add(new Seat('B', 3, true));
        seats.add(new Seat('B', 4, true));
        seats.add(new Seat('B', 5, true));
        seats.add(new Seat('C', 1, true));
        seats.add(new Seat('C', 2, true));
        seats.add(new Seat('C', 3, true));
        seats.add(new Seat('C', 4, true));
        seats.add(new Seat('C', 5, true));
        Cinema cinema = new Cinema("Cinnamon", seats);
        List<Seat> bookedSeats = cinema.bookTickets(3);
        assertEquals(bookedSeats.size(), 3);
        assertEquals(bookedSeats.get(0), seats.get(0));
        assertEquals(bookedSeats.get(1), seats.get(1));
        assertEquals(bookedSeats.get(2), seats.get(2));
        assertFalse(seats.get(0).isAvailable());
        assertFalse(seats.get(1).isAvailable());
        assertFalse(seats.get(2).isAvailable());
    }

    @Test
    public void cannotBookThreeTicketsOnSeparateRows(){
        List<Seat> seats = new ArrayList<Seat>();
        seats.add(new Seat('A', 1, false));
        seats.add(new Seat('A', 2, false));
        seats.add(new Seat('A', 3, false));
        seats.add(new Seat('A', 4, true));
        seats.add(new Seat('A', 5, true));
        seats.add(new Seat('B', 1, true));
        seats.add(new Seat('B', 2, false));
        seats.add(new Seat('B', 3, false));
        seats.add(new Seat('B', 4, false));
        seats.add(new Seat('B', 5, false));
        seats.add(new Seat('C', 1, false));
        seats.add(new Seat('C', 2, false));
        seats.add(new Seat('C', 3, false));
        seats.add(new Seat('C', 4, true));
        seats.add(new Seat('C', 5, true));
        Cinema cinema = new Cinema("Cinnamon", seats);
        List<Seat> bookedSeats = cinema.bookTickets(3);
        assertEquals(bookedSeats.size(), 0);
        assertTrue(seats.get(3).isAvailable());
        assertTrue(seats.get(4).isAvailable());
        assertTrue(seats.get(5).isAvailable());
    }

    @Test
    public void cannotBookWhenLastThreeSeatsSeparatedOnSameRow(){
        List<Seat> seats = new ArrayList<Seat>();
        seats.add(new Seat('A', 1, false));
        seats.add(new Seat('A', 2, true));
        seats.add(new Seat('A', 3, true));
        seats.add(new Seat('A', 4, false));
        seats.add(new Seat('A', 5, true));
        seats.add(new Seat('B', 1, false));
        seats.add(new Seat('B', 2, false));
        seats.add(new Seat('B', 3, false));
        seats.add(new Seat('B', 4, false));
        seats.add(new Seat('B', 5, false));
        seats.add(new Seat('C', 1, false));
        seats.add(new Seat('C', 2, false));
        seats.add(new Seat('C', 3, false));
        seats.add(new Seat('C', 4, false));
        seats.add(new Seat('C', 5, false));
        Cinema cinema = new Cinema("Cinnamon", seats);
        List<Seat> bookedSeats = cinema.bookTickets(3);
        assertEquals(bookedSeats.size(), 0);
        assertTrue(seats.get(1).isAvailable());
        assertTrue(seats.get(2).isAvailable());
        assertTrue(seats.get(4).isAvailable());
    }

    @Test
    public void cannotBookWhenLastThreeSeatsSeparatedOnDifferentRows() {
        List<Seat> seats = new ArrayList<Seat>();
        seats.add(new Seat('A', 1, false));
        seats.add(new Seat('A', 2, true));
        seats.add(new Seat('A', 3, false));
        seats.add(new Seat('A', 4, false));
        seats.add(new Seat('A', 5, false));
        seats.add(new Seat('B', 1, false));
        seats.add(new Seat('B', 2, true));
        seats.add(new Seat('B', 3, false));
        seats.add(new Seat('B', 4, false));
        seats.add(new Seat('B', 5, false));
        seats.add(new Seat('C', 1, false));
        seats.add(new Seat('C', 2, false));
        seats.add(new Seat('C', 3, true));
        seats.add(new Seat('C', 4, false));
        seats.add(new Seat('C', 5, false));
        Cinema cinema = new Cinema("Cinnamon", seats);
        List<Seat> bookedSeats = cinema.bookTickets(3);
        assertEquals(bookedSeats.size(), 0);
        assertTrue(seats.get(1).isAvailable());
        assertTrue(seats.get(6).isAvailable());
        assertTrue(seats.get(12).isAvailable());
    }

    @Test
    public void canPrintArray(){
        Cinema cinema = new Cinema("Cinnamon", seats);
        cinema.printSeats();
    }
}
