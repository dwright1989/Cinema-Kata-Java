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
}
