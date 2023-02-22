package org.techreturners;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CinemaControllerTest {

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
        CinemaController cinemaController = new CinemaController(seats);
        assertTrue(cinemaController.bookTickets(1));
        assertEquals(cinemaController.getCustomer().getSeats().size(), 1);
        assertFalse(cinemaController.getCinema().getSeats().get(0).isAvailable());
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
        CinemaController cinemaController = new CinemaController(seats);
        assertTrue(cinemaController.bookTickets(1));
        assertEquals(cinemaController.getCustomer().getSeats().size(), 1);
        assertFalse(cinemaController.getCinema().getSeats().get(1).isAvailable());
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
        CinemaController cinemaController = new CinemaController(seats);
        assertTrue(cinemaController.bookTickets(1));
        assertEquals(cinemaController.getCustomer().getSeats().size(), 1);
        assertFalse(cinemaController.getCinema().getSeats().get(5).isAvailable());
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
        CinemaController cinemaController = new CinemaController(seats);
        assertFalse(cinemaController.bookTickets(1));
        assertEquals(cinemaController.getCustomer().getSeats().size(), 0);
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
        CinemaController cinemaController = new CinemaController(seats);
        assertTrue(cinemaController.bookTickets(2));
        assertEquals(cinemaController.getCustomer().getSeats().size(), 2);
    }
}
