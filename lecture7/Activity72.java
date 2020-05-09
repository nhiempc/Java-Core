package lecture7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Activity72 {
    public static void main(String[] args) {
        List<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Green");
        color.add("Orange");
        color.add("White");
        color.add("Black");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input color and index: ");
        String str = sc.nextLine();
        String[] str_array = str.split(" ");
        color.add(Integer.parseInt(str_array[1]),str_array[0]);
        System.out.println("Result: ");
        for (String rs: color){
            System.out.print(rs+" ");
        }
    }
}
