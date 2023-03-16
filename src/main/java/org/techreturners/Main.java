package org.techreturners;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CinemaController cinemaController = new CinemaController("Cinnamon", "Debbie");
        cinemaController.randomlyFillSeats();
    }
}