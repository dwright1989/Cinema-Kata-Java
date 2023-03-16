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
        cinemaController = new CinemaController("Cinnamon", "Debbie");
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
