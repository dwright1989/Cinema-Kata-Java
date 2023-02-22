package org.techreturners;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String name;
    private List<Seat> seats;

    public Cinema(String name, List<Seat> seats) {
        this.name = name;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public void printSeats() {
        System.out.println("Welcome to " + name + " Cinema");
        char currentRow = ' ';
        for (Seat seat : this.seats) {
            if(currentRow != seat.getRow()){
                System.out.println();
            }
            currentRow=seat.getRow();
            if(seat.isAvailable()){
                System.out.print("\033[1;32m");
            }else{
                System.out.print("\033[0;91m");
            }
            System.out.print(seat.getRow() + "" + seat.getNumber() + " ");
        }
    }
}
