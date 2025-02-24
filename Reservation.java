package hotel;

public class Reservation {
    private Customer customer;
    private Room room;
    private boolean active;

    public Reservation(Customer customer, Room room) {
        this.customer = customer;
        this.room = room;
        this.active = true;
        room.bookRoom();
    }

    public void cancelReservation() {
        if (active) {
            active = false;
            room.freeRoom();
            System.out.println("Reservation canceled for " + customer);
        } else {
            System.out.println("Reservation is already canceled.");
        }
    }

    @Override
    public String toString() {
        return customer + " booked " + room + " - " + (active ? "Active" : "Canceled");
    }
}
