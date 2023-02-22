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
                seat.setAvailable(false);
                customer.getSeats().add(seat);
                return true;
            }
        }
        return false;
    }


    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
