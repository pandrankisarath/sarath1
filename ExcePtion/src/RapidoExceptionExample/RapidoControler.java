package RapidoExceptionExample;

public class RapidoControler {

    public void Controler(String id,int otp){
        try{
            RapodoService rs = new RapodoService() ;
            rs.service(id, otp);
        }
        catch (InvalidOtpException e){

            System.out.println("  error message "+ e.getMessage());
            throw e;
        }
    }
}
