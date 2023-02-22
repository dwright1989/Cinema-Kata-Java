package org.techreturners;
import java.util.List;

public class CinemaController {

    Cinema cinema;
    Customer customer;

    public CinemaController(List<Seat> seats, String cinemaName, String customerName) {
        cinema = new Cinema(cinemaName, seats);
        customer = new Customer(customerName);
    }


    public Cinema getCinema() {
        return cinema;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void bookTickets(int num){
        List<Seat> bookedSeats = cinema.bookTickets(num);
        customer.setSeats(bookedSeats);
    }

    /*public randomlyFillSeats(){

    }*/

}
