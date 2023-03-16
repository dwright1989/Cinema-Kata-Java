package org.techreturners;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CinemaController {

    Cinema cinema;
    Customer customer;

    Scanner scanner;

    public CinemaController(String cinemaName, String customerName) {
        scanner = new Scanner(System.in);
        cinema = new Cinema(cinemaName, generateSeats());
        customer = new Customer(customerName);
        start();
    }

    private void start(){
        System.out.print("\033[1;32m");
        System.out.println("Welcome to: " + cinema.getName() + " cinema");
        while(!cinema.soldOut()){
            System.out.println("Look at the screen below and decide how many seats you would like.");
            cinema.printSeats();
            int ticketNumber = scanner.nextInt();
            System.out.println("Do you need to sit together?");
            System.out.println("[1] Yes");
            System.out.println("[2] No");
            String sitTogether = scanner.next();
            boolean success = bookTickets(ticketNumber);
            if(success){
                cinema.printSeats();
                System.out.println("Tickets booked!");
            }
            else{
                System.out.println("Not enough seats left, sorry");
            }
            System.out.println();
        }
        System.out.println("Movie sold out!");
    }

    private List<Seat> generateSeats() {

        List<Seat> seats = new ArrayList<Seat>();
        for(int i=0; i<Constants.NUM_OF_ROWS; i++){
            char letter = getCharFromNumber(i);
            for(int j=1; j<=Constants.NUM_OF_SEATS_IN_ROW; j++){
                seats.add(new Seat(letter, j, true));
            }
        }
        return seats;
    }

    public static char getCharFromNumber(int i) {
        return i<0 || i>25 ? '?' : (char)('A' + i);
    }

    public Customer getCustomer() {
        return customer;
    }

    public boolean bookTickets(int num){
        List<Seat> bookedSeats = cinema.bookTickets(num);
        customer.setSeats(bookedSeats);
        return bookedSeats.size()>0;
    }

}
