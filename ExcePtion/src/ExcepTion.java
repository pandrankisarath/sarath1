import java.util.Locale;

public class ExcepTion {

    public static void main(String[] args){


           StuDent stu = new StuDent();
          try{
              stu.name = null;
           ExampLe e = new ExampLe();
          // String s = e.uppercase(stu);


              // ExampLe e = new ExampLe();
               String s = e.uppercase(stu);
               System.out.println(s);
           }
          catch (Exception exception) {
           System.out.println(exception.getMessage());
           }
          finally {
               System.out.println(stu.name);
           }

    }
}

