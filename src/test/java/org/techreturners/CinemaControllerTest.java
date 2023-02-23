package org.techreturners;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;



public class CinemaControllerTest {

    CinemaController cinemaController;

    @BeforeEach
    public void setUp(){
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
        cinemaController = new CinemaController(seats, "Cinnamon", "Debbie");
    }


    @Test
    public void canBookTickets(){
        cinemaController.bookTickets(3);
        assertEquals(cinemaController.getCustomer().getSeats().size(), 3);
    }


    @Test
    public void randomlyAssignSeats(){
        cinemaController.randomlyFillSeats();
    }



}
