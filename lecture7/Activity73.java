package lecture7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Activity73 {
    public static void main(String[] args) {
        int i = 1000000;
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();
        for(int t=0;t<10;t++){
            long t1 = System.currentTimeMillis();
            for (int index = 0; index <= i; index++) {
                arrayList.add(index);
            }
            long t1End = System.currentTimeMillis() - t1;

            long t2 = System.currentTimeMillis();

            for (int index = 0; index <= i; index++) {
                linkedList.add(index);
            }
            long t2End = System.currentTimeMillis() - t2;

            System.out.println("Array List: " + t1End+" ms");
            System.out.println("Linked List: " + t2End+" ms");
            System.out.println("===========================");
        }
    }
}
