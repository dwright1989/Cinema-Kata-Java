package org.techreturners;


import org.junit.jupiter.api.BeforeEach;

public class CinemaControllerTest {

    CinemaController cinemaController;

    @BeforeEach
    public void setUp(){
        cinemaController = new CinemaController("Cinnamon", "Debbie");
    }


}
