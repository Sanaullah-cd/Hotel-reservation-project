package hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Grand Hotel");

        Room room1 = new Room(101);
        hotel.addRoom(room1);

        Customer customer1 = new Customer("Ali", "+987654321");
        Reservation res1 = new Reservation(customer1, room1);

        Payment payment = new Payment(customer1, 200.0);
        payment.processPayment();
    }
}
