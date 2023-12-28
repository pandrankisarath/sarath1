package RapidoExceptionExample;

public class RapidoRepository {

    public  void rapidoRepo(String id, int OTP){
         String ID = "captain";
        int GeneratedOTP = 1234;

        String status = "Rapido Booked";
        if(GeneratedOTP==OTP){
            System.out.println("Rapido Ride Ready");
        }
        else {
            throw new InvalidOtpException(ErrorCode.INVALIDOTP.toString(), " Invalid OTP " );
        }


    }
}
