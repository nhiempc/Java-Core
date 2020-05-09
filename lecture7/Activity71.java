package lecture7;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Activity71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,q;
        do{
            System.out.println("Input number of element: ");
            n = sc.nextInt();
            sc.nextLine();
            if(n<1||n>4000){
                System.out.println("Out of range!");
            }
        }while (n<1||n>4000);

        System.out.println("Input an array(separated by space): ");
        String array = sc.nextLine();
        do{
            System.out.println("Input number of querry: ");
            q = sc.nextInt();
            if(q<1||q>4000){
                System.out.println("Out of range!");
            }
        }while (q<1||q>4000);
        List<Integer> list = new ArrayList<>();
        String[] arr = array.split(" ");
        for (int i = 0;i<arr.length;i++){
            list.add(Integer.parseInt(arr[i]));
        }
        Scanner scanner = new Scanner(System.in);
        String querry;
            for (int i=0;i<q;i++){
                System.out.println("Insert querry "+(i+1)+" : ");
                querry = scanner.nextLine();
                if (querry.compareTo("Insert")==0){
                    System.out.println("Input index and value: ");
                    String insert = scanner.nextLine();
                    String[] insert_value = insert.split(" ");
                    list.add(Integer.parseInt(insert_value[0]),Integer.parseInt(insert_value[1]));
                    System.out.println("Result: ");
                    for (Integer rs:list){
                        System.out.print(rs+" ");
                    }
                    System.out.println();
                }else if(querry.compareTo("Delete")==0){
                    System.out.println("Input index: ");
                    String index = scanner.nextLine();
                    list.remove(Integer.parseInt(index));
                    System.out.println("Result: ");
                    for (Integer rs:list){
                        System.out.print(rs+" ");
                    }
                    System.out.println();
                }else {
                    System.out.println("Wrong querry!");
                    i--;
                }
            }
    }
}
