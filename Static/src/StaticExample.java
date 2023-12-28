public class StaticExample {

    static int count=10;
    int count2=100;

    public void add(){
        count=count+1;
        count2=count2+count+1;
        System.out.println(count);
        System.out.println(count2);
    }
}
