
package hotelreservationsystem;


public class Room {

    private int number;
    private String type;
    private boolean isAvailable;

    public Room(int number, String type) throws Exception {
    
    if(type.equals("Single") == false && type.equals("Double") == false){
      
        throw new Exception("Informe o tipo de quarto como Single ou Double");
    }
        this.isAvailable = true;
        this.number = number;
        this.type = type;
    }
    
    
    public int getNumber() {
        return this.number;
    }

    public String getType() {
        return this.type;
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
                "number=" + number +
                ", roomType='" + type + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }

}
