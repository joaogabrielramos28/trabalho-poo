
package hotelreservationsystem;


public class Room {

    private int roomNumber;
    private String roomType;
    private boolean isAvailable;

    public Room(int roomNumber, String roomType) throws Exception {
    
    if(roomType.equals("Single") == false && roomType.equals("Double") == false){
      
        throw new Exception("Informe o tipo de quarto como Single ou Double");
    }
        this.isAvailable = true;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }
    
    
    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }


    public boolean isAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
      public void bookRoom() {
        this.isAvailable = false;
    }

    public void vacateRoom() {
        this.isAvailable = true;
    }
    
    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", roomType='" + roomType + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }

}
