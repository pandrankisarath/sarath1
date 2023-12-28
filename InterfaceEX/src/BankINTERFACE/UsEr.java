package BankINTERFACE;

public class UsEr {
    public static  void main(String[] args){
        UsEr user = new UsEr();

        SBI sbi = new SBI();
        sbi.BenifiCiary(555,"chandu");
        sbi.ValiDation(1221,"SBI01221");
        //sbi.ValiDation(0,"f");
        sbi.TransFer(555,1000);

        HDFC hdfc = new HDFC();
        hdfc.BenifiCiary(666,"shiva");
        //hdfc.ValiDation(2112,"HDFC02112");
        hdfc.ValiDation(1,"k");
        hdfc.TransFer(666,2000);

        KOTAK kotak = new KOTAK();
        kotak.BenifiCiary(000,"sarath");
        kotak.TransFer(000,312456);


    }

}
