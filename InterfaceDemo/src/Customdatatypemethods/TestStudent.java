package Customdatatypemethods;

public class TestStudent {
     public AddrEss getAddress(Student ss,TeaCher tt,CollEge cc){

         Student s1=new Student("sarath","11",new AddrEss("111","KBHP"));
         TeaCher t1=new TeaCher("teacher",new AddrEss("222","MIYAPUR"));
         CollEge c1=new CollEge("NEOTERIC",new AddrEss("333","HITECHCITY"));

         if(ss != null){
             if(s1.getName()== ss.getName()){
             return s1.getAddress();
             }
             return null;

         }
         else if (tt != null){
             if (t1.getName()== tt.getName()) {
                 return t1.getAddress();
             }
             return null;
         }
         else if (cc != null) {
             if(c1.getName()== cc.getName()) {
                 return c1.getAddress();
             }
             return null;
         }
         else{
             return null;
         }

     }
     public static void  main(String[] args){

         TestStudent ts =new TestStudent();
         //AddrEss add= ts.getAddress(null,new TeaCher("teacher",new AddrEss("222","MIYAPUR")),null);

         //System.out.println(add.getArea());
        // System.out.println(add.getDoorno());
         Student sss= new Student("sarath",null,null);
         TeaCher ttt= new TeaCher("teacher",null);
         CollEge ccc= new CollEge("NEOTERIC",null);

         System.out.println(ts.getAddress(null,ttt,null));


     }
}
