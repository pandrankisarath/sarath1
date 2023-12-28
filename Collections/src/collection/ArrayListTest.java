package collection;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer>list1=new ArrayList<Integer>();
        list1.add(1);
        list1.add(4);
        list1.add(3);
        list1.add(2);
        list1.add(8);
        list1.add(6);
        list1.add(7);
        list1.add(5);
        for(int i=0;i<list1.size();i++) {
            System.out.println(list1.get(i));
        }

    }
}
