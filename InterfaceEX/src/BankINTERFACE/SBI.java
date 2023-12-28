package BankINTERFACE;

public  class SBI implements FundsValidate{

    private boolean otpvalidate = false;

    public  void BenifiCiary(int ToAcc,String Name){
        System.out.println("Benificiary Added To SBI . Benificiary AccNo : " + ToAcc +". Benificiary Name: "+ Name);
    }

    @Override
    public void TransFer(int AccNo, int Amount) {
        if (otpvalidate){
            System.out.println("Ammount Transfered to SBI:" + AccNo+ "Ammount Transfered:" + Amount);
        }
        else {
            System.out.println("Please Enter Valid Credentials");
        }
    }
    @Override
    public void  ValiDation(int OTP, String Username) {
        if (OTP == 1221 && Username.equals("SBI01221")) {
            System.out.println("Valid User");
            otpvalidate=true;
        } else {
            System.out.println("Invalid OTP");
        }
    }
}
