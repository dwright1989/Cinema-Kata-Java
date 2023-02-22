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
    public void canPrintArray(){
        Cinema cinema = new Cinema("Cinnamon", seats);
        cinema.printSeats();
    }
}
