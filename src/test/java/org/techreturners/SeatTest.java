package org.techreturners;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class SeatTest {

    @Test
    public void canCreateSeat(){
        Seat seat = new Seat('A', 1, true);
        assertNotNull(seat);
    }
}
