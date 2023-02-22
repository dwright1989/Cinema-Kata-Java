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
}
