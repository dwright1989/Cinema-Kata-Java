package org.techreturners;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Seat> seats = new ArrayList<Seat>();
        seats.add(new Seat('A', 1, false));
        seats.add(new Seat('A', 2, true));
        seats.add(new Seat('A', 3, true));
        seats.add(new Seat('A', 4, false));
        seats.add(new Seat('A', 5, true));
        seats.add(new Seat('B', 1, false));
        seats.add(new Seat('B', 2, false));
        seats.add(new Seat('B', 3, false));
        seats.add(new Seat('B', 4, false));
        seats.add(new Seat('B', 5, false));
        seats.add(new Seat('C', 1, false));
        seats.add(new Seat('C', 2, false));
        seats.add(new Seat('C', 3, false));
        seats.add(new Seat('C', 4, false));
        seats.add(new Seat('C', 5, false));
        CinemaController cinemaController = new CinemaController(seats, "Cinnamon", "Debbie");
       // cinemaController.randomlyFillSeats();
    }
}