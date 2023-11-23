/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelreservationsystem;

import java.util.Date;


public class HotelReservationSystem {

    
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Sample Hotel", 10); // Creating a hotel with 10 rooms

        hotel.displayAvailableRooms(); // Displaying available rooms before reservation
        
        
        Date checkInDate = new Date();
        Date checkOutDate = new Date(checkInDate.getTime() + 86400000); // Adding 1 day to check-in date
        
            Reservation reservation = hotel.bookRoom(1,checkInDate, checkOutDate,"Joao");
       
        if (reservation != null) {
            System.out.println("Room booked successfully. Reservation ID: " + reservation.getRoom());
        } else {
            System.out.println("Room not available or invalid room number.");
        }

        hotel.displayAvailableRooms();
        
        
                hotel.displayAvailableRooms(); 

        if (reservation != null) {
            hotel.finishOrCancelReservation(reservation);
            hotel.displayAvailableRooms();
        }


    }
    
}
