package RapidoExceptionExample;

public class RapodoService {

    public void service(String id,int otp){

        try{
            RapidoRepository rr = new RapidoRepository();
            rr.rapidoRepo(id, otp);
        }
        catch (InvalidOtpException e){
            //e.printStackTrace();
            System.out.println("  error message "+ e.getMessage());
            throw e;

        }

    }
}
