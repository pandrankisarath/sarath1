package MovieTicketBooking;

public class MovieTicket {

    private  String movieName;
    private  String theaterName;

    private String showTime;

    public MovieTicket(String movieName, String theaterName, String showTime) {
        this.movieName = movieName;
        this.theaterName = theaterName;
        this.showTime = showTime;
    }

    public MovieTicket() {



    }

    public String getMovieName() {
        return movieName;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public String getShowTime() {
        return showTime;
    }

    @Override
    public String toString() {
        return "MovieTicket{" +
                "movieName='" + movieName + '\'' +
                ", theaterName='" + theaterName + '\'' +
                ", showTime='" + showTime + '\'' +
                '}';
    }
}
