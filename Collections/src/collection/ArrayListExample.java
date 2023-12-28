package collection;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArrayListExample {

    static Predicate<Integer> marksPredicate = (marks) -> marks > 36;


    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);
        List<Integer> passedStudents = new ArrayList<>();
        for (int i=0;i<numbers.size();i++){
            if(marksPredicate.test(numbers.get(i))) {
                passedStudents.add(numbers.get(i));

            }
        }
        System.out.println(passedStudents);
        List<Integer> streampassedStudents = numbers.stream()
                .filter( number -> marksPredicate.test(number))
                .collect(Collectors.toList());
        System.out.println(" stream passed students" + streampassedStudents);

    }
}
