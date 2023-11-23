package hotelreservationsystem;


import java.util.Date;

public class Reservation {

    private long id;
    private Date checkInDate;
    private Date checkOutDate;
    private String customer;
    private Room room;

    public Reservation(Date checkInDate, Date checkOutDate, String customer, Room room) {
        this.id = System.currentTimeMillis();
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.customer = customer;
        this.room = room;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public Room getRoom() {
        return room;
    }

}
