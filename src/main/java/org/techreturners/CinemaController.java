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
        List<Seat> seats = cinema.getSeats();
        Seat nextSeat = seats.get(1);
        for(int i=0; i<seats.size(); i++){
            Seat currentSeat = seats.get(i);
            if(seats.size()>i+1){
                nextSeat = seats.get(1);
            }
            if(currentSeat.isAvailable()){
                if(num>1 && !nextSeat.isAvailable()){
                    return false;
                }else{
                    if(num>1){
                        nextSeat.setAvailable(false);
                        customer.getSeats().add(nextSeat);
                    }
                    currentSeat.setAvailable(false);
                    customer.getSeats().add(currentSeat);
                    return true;
                }

            }
        }
        return false;
    }


    public Cinema getCinema() {
        return cinema;
    }

    public Customer getCustomer() {
        return customer;
    }

}
