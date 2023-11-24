import Model.HotelLocation;
import Model.Reciepe;

public abstract class FoodTemplate {

    public abstract void Price();

    public abstract void Quantity();

    public abstract void Addon();

    public final void getFood(){
        gethotellocation();
        getReciepe();
        Price();
        Quantity();
        Addon();

        System.out.println("Food Is Ready");

    }
    public HotelLocation gethotellocation(){
        return new HotelLocation("MEAFIL","Nijampeta",1);
    }
    public Reciepe getReciepe(){
        return new Reciepe("mefilSpecial","chillipepper");
    }

}
