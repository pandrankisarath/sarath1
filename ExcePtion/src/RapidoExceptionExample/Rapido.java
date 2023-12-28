package RapidoExceptionExample;

public class Rapido {

    public static void main(String[] args) {
        try {
            RapidoControler rc = new RapidoControler();
            rc.Controler("sarath",123);
            //rc.Controler("captain",1234);

        } catch (InvalidOtpException IOE) {
            System.out.println(IOE.getErrorCode().toString()+" "+IOE.getMessage());
        }
        finally {
            System.out.println("Rapido Booking");

        }
    }

}
