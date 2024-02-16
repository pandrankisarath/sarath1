package MovieTicketBooking;

public class LoginProcess {
    private  String validUsername = "Neoteric";
    private  String validPassword = "TechJunkies";

    public boolean login(String username, String password) {
        return username.equals(validUsername) && password.equals(validPassword);
    }
}

