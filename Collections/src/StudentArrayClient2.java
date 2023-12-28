public class StudentArrayClient2 {


    public static void main(String[] args) {


        StudentArray s1 = new StudentArray("Student1", 101);
        StudentArray s2 = new StudentArray("Student2", 102);
        StudentArray s3 = new StudentArray("Student3", 103);
        StudentArray s4 = new StudentArray("Student4", 104);
        StudentArray s5 = new StudentArray("Student5", 105);

        StudentArray[] array1 = new StudentArray[5];
        StudentArray[] array2 = new StudentArray[5];

        array1[0] =s1;
        array1[1] =s2;
        array1[2] =s3;
        array1[3] =s4;
        array1[4] =s5;

        array2[0] =s1;
        array2[1] =s2;
        array2[2] =s3;
        array2[3] =s4;
        array2[4] =s5;

        for(int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }
        for(int i=0;i<array2.length;i++){
            System.out.println(array2[i]);
        }

      //  s1.name="sarath";
        s1.setName("neoteric");

        for(int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }

    }
}
