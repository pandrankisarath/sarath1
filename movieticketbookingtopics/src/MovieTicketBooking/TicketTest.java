package MovieTicketBooking;

public class TicketTest {

    public static void main(String[] args) {

        LoginProcess login = new LoginProcess();
        boolean user =login.login("Neoteric","TechJunkies");

        if (user==true){
            System.out.println("Login Succesfull");

            MovieTicket movieTicket = new MovieTicket("Salaar","Neoteric","8am to 5pm");
            System.out.println(movieTicket);

            CounterBooking ticket1 = new CounterBooking("Kushi","Neoteric","8 to 5",2);
            int cost = ticket1.displayTicket(3);
            System.out.println(cost);

            MovieTicket ticket2 = new OnlineBooking("GameChanger","Neoteric","8am to 5pm");
            System.out.println(ticket2.getTheaterName());



        }else {
            System.out.println("Login Failed");
        }

    }
}
