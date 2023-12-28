package BankINTERFACE;

public class HDFC implements FundsValidate{

    private boolean otpvalidate = false;

    public  void BenifiCiary(int ToAcc,String Name){
        System.out.println("Benificiary Added To HDFC. Benificiary AccNo : " + ToAcc +". Benificiary Name: "+ Name);
    }

    @Override
    public void TransFer(int AccNo, int Amount) {
        if (otpvalidate){
            System.out.println("Ammount Transfered to HDFC:" + AccNo+ "Ammount Transfered:" + Amount);
        }
        else {
            System.out.println("Please Enter Valid Credentials");
        }
    }
    @Override
    public void  ValiDation(int OTP, String Username) {
        if (OTP == 2112 && Username.equals("HDFC02112")) {
            System.out.println("Valid User");
            otpvalidate=true;
        } else {
            System.out.println("Invalid OTP");
        }
    }
}
