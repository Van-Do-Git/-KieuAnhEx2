package Bai1;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;


public class Customer extends Person {

    private Room kindRoom;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Customer() {
    }

    public Customer(String id, String name, LocalDate born, Room kindRoom, LocalDate checkIn, LocalDate checkOut) {
        super(id, name, born);
        this.kindRoom = kindRoom;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Room getKindRoom() {
        return kindRoom;
    }

    public void setKindRoom(Room kindRoom) {
        this.kindRoom = kindRoom;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public double caculateAmount() {
        return DAYS.between(checkIn,checkOut)*kindRoom.getCost();
    }

    @Override
    public String toString(){
        return " Name: "+getName()+
                " id "+getId()+
                " born: "+getBorn()+
                " check in: "+getCheckIn()+
                " check out: "+getCheckOut()+
                " kind room: "+getKindRoom();
    }

}
