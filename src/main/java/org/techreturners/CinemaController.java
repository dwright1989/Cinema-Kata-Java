package org.techreturners;

import java.util.ArrayList;
import java.util.List;

public class CinemaController {

    Cinema cinema;
    Customer customer;

    public CinemaController(List<Seat> seats) {
        cinema = new Cinema("Cinnamon", seats);
        customer = new Customer("Debbie");
    }


    public Cinema getCinema() {
        return cinema;
    }

    public Customer getCustomer() {
        return customer;
    }

}
