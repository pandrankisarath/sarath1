package MovieTicketBooking;

public class TicketTest {

    public static void main(String[] args) {

        LoginProcess login = new LoginProcess();
        boolean user =login.login("Neoteric","TechJunkies");

        if (user==true){
            System.out.println("Login Succesfull");





        }else {
            System.out.println("Login Failed");
        }

    }
}
