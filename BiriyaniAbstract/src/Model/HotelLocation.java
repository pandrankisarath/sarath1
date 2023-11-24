package Model;

public class HotelLocation {
    private  String Hotelname;
    private String Area;
    private int Roadno;

    public HotelLocation(String Hotelname,String Area,int Roadno){
        this.Hotelname=Hotelname;
        this.Area=Area;
        this.Roadno=Roadno;
    }

    public String toString(){
        return "Hotelname:" + Hotelname + "Area:" + Area + "Roadno:" + Roadno;
    }







}
