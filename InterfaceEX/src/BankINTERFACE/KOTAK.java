package BankINTERFACE;

public class KOTAK implements FundsTransfer {

    @Override
    public void BenifiCiary(int ToAcc, String Name) {

      System.out.println("Benificiary Added To KOTAK .Benificiary AccNo: " + ToAcc +". Benificiary Name: " + Name);

    }

    @Override
    public void TransFer(int AccNo, int Amount) {

        System.out.println("Ammount Transfered to HDFC:" + AccNo+ "Ammount Transfered:" + Amount);

    }
}
