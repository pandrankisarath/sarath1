package MovieTicketBooking;

public class CounterBooking extends MovieTicket{

    private int noOfSeats;

    public CounterBooking(String movieName, String theaterName, String showTime,  int noOfSeats) {
        super(movieName, theaterName, showTime);
        this.noOfSeats = noOfSeats;
    }


    public int displayTicket() {

       return noOfSeats;
    }
    public int displayTicket(int noOfSeats) {
        //noOfSeats =200*noOfSeats;
        System.out.println("No Of Seats: " + noOfSeats);
        noOfSeats =200*noOfSeats;
        return noOfSeats;

    }


}
