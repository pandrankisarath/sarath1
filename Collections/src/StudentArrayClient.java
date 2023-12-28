public class StudentArrayClient {

    public static void main(String[] args) {

     /*   StudentArray s1 = new StudentArray("Student1" , 101);
        StudentArray s2 = new StudentArray("Student2" , 102);
        StudentArray s3 = new StudentArray("Student3" , 103);
        StudentArray s4 = new StudentArray("Student4" , 104);
        StudentArray s5 = new StudentArray("Student5" , 105);

        StudentArray [] s =new StudentArray[5];

        s[0]=s1;
        s[1]=s2;
        s[2]=s3;
        s[3]=s4;
        s[4]=s5;

        for(int i=0;i<s.length;i++){
           System.out.println(s[i]);
        }*/


        StudentArray [] s =new StudentArray[5];
        s[0]=new StudentArray("Student1",101);
        s[1]=new StudentArray("Student2",102);
        s[2]=new StudentArray("Student3",103);
        s[3]=new StudentArray("Student3",104);
        s[4]=new StudentArray("Student5",105);

        for (int i=0;i<s.length;i++){
            System.out.println(s[i].name);
            System.out.println(s[i].id);
        }




    }
}
