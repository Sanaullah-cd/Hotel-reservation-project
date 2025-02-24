package hotel;

public class Room {
    private int roomNumber;
    private boolean available;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void bookRoom() {
        if (available) {
            available = false;
            System.out.println("Room " + roomNumber + " is now booked.");
        } else {
            System.out.println("Room " + roomNumber + " is already booked.");
        }
    }

    public void freeRoom() {
        available = true;
        System.out.println("Room " + roomNumber + " is now available.");
    }

    @Override
    public String toString() {
        return "Room " + roomNumber + " - " + (available ? "Available" : "Booked");
    }
}
