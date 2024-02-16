package MovieTicketBooking;

public class CounterBooking extends MovieTicket{

    private int noOfSeats;

    public CounterBooking(String movieName, String theaterName, String showTime,  int noOfSeats) {
        super(movieName, theaterName, showTime);
        this.noOfSeats = noOfSeats;
    }


    public void displayTicket() {

        System.out.println("No Of Seats : " + noOfSeats);
    }
    public void displayTicket(int ticketPrice) {
        ticketPrice =200*noOfSeats;
        System.out.println("No Of Seats: " + noOfSeats);
        System.out.println(ticketPrice);

    }


}
