package hotelreservationsystem;


import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hotel {

    private String name;
    private Room[] rooms;
    private ArrayList<Reservation> reservations;

    public Hotel(String name, int numberOfRooms) {
        this.name = name;
        this.rooms = new Room[numberOfRooms];
        this.reservations = new ArrayList<>();
        try {
            initializeRooms();
        } catch (Exception ex) {
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void initializeRooms() throws Exception {
        for (int i = 0; i < rooms.length; i++) {
            String roomType = i % 2 == 0 ? "Single" : "Double";
            rooms[i] = new Room(i + 1, roomType);
        }
    }

    public void displayAvailableRooms() {
        System.out.println("Available Rooms at " + name + ":");
        for (Room room : rooms) {
            if (room.isAvailable()) {
                System.out.println("Room Number: " + room.getNumber()+ " - Type: " + room.getType());
            }
        }
    }
    
    public void getReservation () {
        System.out.println("Reservations at " + name + ":");
        for (Reservation reservation : reservations) {
             System.out.println("Reservation room: " + reservation.getRoom()+ " - checkInDate: " + reservation.getCheckInDate());
            
        }
    }

    public Reservation bookRoom(int roomNumber, Date checkInDate, Date checkOutDate, String customer){
        for (Room room : rooms) {
            if (room.getNumber() == roomNumber && room.isAvailable()) {
                room.bookRoom();
                Reservation reservation = new Reservation(checkInDate, checkOutDate, customer, room);
               reservations.add(reservation);
                return reservation;
            }
        }
        
        return null;
        
        
    }
    
    
    
    public void finishOrCancelReservation(Reservation reservation) {
        Room room = reservation.getRoom();
        room.vacateRoom();
        System.out.println("Reservation " + reservation + " has been canceled.");
    }

}
