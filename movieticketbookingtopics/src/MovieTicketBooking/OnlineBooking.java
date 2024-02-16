package MovieTicketBooking;

public class OnlineBooking extends MovieTicket {

    private String bookingCode;

    public OnlineBooking(){
        super();

    }
    public OnlineBooking(String movieName, String theaterName, String showTime) {
        super(movieName, theaterName, showTime);
        this.bookingCode = "Techjunkies";
    }


    public void displayTicket() {

        System.out.println("Booking Reference: " + bookingCode);
    }



}
