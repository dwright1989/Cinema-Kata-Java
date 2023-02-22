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
}
