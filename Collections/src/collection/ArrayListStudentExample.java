package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArrayListStudentExample {

    static Predicate<Student> countryPredicate = (country) -> country.getCountry() .equalsIgnoreCase("us") ;


    public static void main(String[] args) {
        List<Student> names = new ArrayList<Student>();

        Student s1 = new Student("Student1","US");
        Student s2 = new Student("Student2","Australia");
        Student s3 = new Student("Student3","UK");

        names.add(s1);
        names.add(s2);
        names.add(s3);
       /* List<Student> sameCountryStudents = new ArrayList<>();
        for (int i=0;i< names.size();i++){
            if (countryPredicate.test(names.get(i))){
                sameCountryStudents.add(names.get(i));
            }
        }
        System.out.println(sameCountryStudents);*/
        List<Student>streamSameCountryStudents = names.stream()
                .filter(country -> countryPredicate.test(country))
                .collect(Collectors.toList());
        System.out.println(" stream same country students" + streamSameCountryStudents);


    }
}
