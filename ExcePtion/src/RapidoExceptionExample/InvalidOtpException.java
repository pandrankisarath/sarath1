package RapidoExceptionExample;

public class InvalidOtpException extends RuntimeException{

    private String errorCode;
    public InvalidOtpException(String otp,String message){
        super(message);
        this.errorCode=otp;

    }

    public String getErrorCode() {
        return errorCode;
    }
}
