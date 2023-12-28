import Model.Battery;
import Model.Lens;

public abstract class  SpecifiAtions implements CameRa {

    abstract void model();
    abstract void design();
    public void Specifications(){

        System.out.println("There are so many specifications.");
    }
    public final void getcamera(){
        getbattery();
        getdisplay();
        model();
        design();
        Company();
        Product();

    }
    public Battery getbattery(){
        return new Battery(10000, "Nippo");

    }
    public Lens getdisplay(){

        return new Lens( "Short",55.5);
    }



}
