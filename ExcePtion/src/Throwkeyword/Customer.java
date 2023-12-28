package Throwkeyword;

public class Customer {
    public static void main(String[] args){
        Rapidobooking rapidobooking = new Rapidobooking();
        try {
            rapidobooking.RapidoBike(14,10);
            //int s1 = BookingTime-WaitingTime<10

            }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        finally {
            System.out.println("please use again");
        }
    }
}
