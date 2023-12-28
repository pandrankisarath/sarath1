public class Client {

    public  static  void main(String[] args){
        Canon c = new Canon();
        c.Specifications();
        c.getcamera();
        System.out.println("*************************");
        SpecifiAtions s = new Nikon();
        s.Specifications();
        s.getcamera();

    }

}
