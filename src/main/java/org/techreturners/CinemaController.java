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

    public boolean bookTickets(int num){
        List<Seat> bookedSeats = cinema.bookTickets(num);
        customer.setSeats(bookedSeats);
        return bookedSeats.size()>0;
    }

    public void randomlyFillSeats(){
        int randomNumber;
        while(!cinema.soldOut()){
            randomNumber = (int) (Math.random() * 3 + 1);
            System.out.print("\033[1;32m");
            System.out.print("looking for " + randomNumber + " seats");
            boolean success = bookTickets(randomNumber);
            cinema.printSeats();
           if(success){
               System.out.println("Tickets booked!");
           }
            else{
                System.out.println("None left, sorry");
            }
            System.out.println();
        }
        System.out.println("Movie sold out!");
    }

}
