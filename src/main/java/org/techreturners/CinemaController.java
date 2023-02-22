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

    public boolean bookTickets(int num){
        for(Seat seat: cinema.getSeats()){
            if(seat.isAvailable()){
                return true;
            }
        }
        return false;
    }






}
