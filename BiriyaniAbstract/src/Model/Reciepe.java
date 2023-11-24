package Model;

public class Reciepe {
    private String reCiepe;
    private String Seasoning;

    public Reciepe(String reCiepe,String Seasoning){
        this.reCiepe=reCiepe;
        this.Seasoning=Seasoning;
    }
    public String toString(){
        return "Seasoning:"+Seasoning+"reCiepe"+reCiepe;
    }


}
