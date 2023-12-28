package Throwkeyword;

public class Rapidobooking {


    public int RapidoBike(int BookingTime, int WaitingTime) throws Exception {
        int cancletimeout =10;
        if (cancletimeout>=WaitingTime){
            cancletimeout=cancletimeout-BookingTime;


            System.out.println("Bike Is On The Way: "+cancletimeout);
        }
        else {
            throw new Exception("All Bikes Are Busy");
        }

        return cancletimeout;
    }
}
