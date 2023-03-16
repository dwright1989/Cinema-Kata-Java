package org.techreturners;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private final String name;
    private final List<Seat> seats;

    public Cinema(String name, List<Seat> seats) {
        this.name = name;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public List<Seat> getSeats() {
        return seats;
    }
    public List<Seat> checkSeatsAvailable(int num, boolean together){
        List<Seat> seatsToBook = new ArrayList<>();
        for(int i=0; i<seats.size(); i++){
            Seat currentSeat = seats.get(i);
            if(currentSeat.isAvailable()){
                seatsToBook.add(currentSeat);
                for(int j=1; j<num; j++){
                    Seat nextSeat = null;
                    if(seats.size()>i+j){
                        nextSeat = seats.get(i+j);
                    }
                    if(nextSeat!=null && nextSeat.isAvailable()){
                        if(together && nextSeat.getRow()==currentSeat.getRow()){
                            seatsToBook.add(nextSeat);
                        }else if(!together){
                            seatsToBook.add(nextSeat);
                        }else{
                            seatsToBook.clear();
                        }
                    }else{
                        seatsToBook.clear();
                    }
                }
                if(seatsToBook.size()==num){
                    break;
                }
            }
        }
        return seatsToBook;
    }


    public List<Seat> bookTickets(int num, boolean together){
        List<Seat> seatsToBook = checkSeatsAvailable(num, together);
        for(Seat seatToBook: seatsToBook){
           seatToBook.setAvailable(false);
        }
        return seatsToBook;
    }

    public boolean soldOut(){
        for(Seat seat: seats){
            if(seat.isAvailable()){
                return false;
            }
        }
        return true;
    }



    public void printSeats() {
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
        System.out.println();
    }
}
