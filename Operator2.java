import java.util.Scanner;
public class Operator2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất:");
        int a = sc.nextInt();
        System.out.println("Nhập số thứ hai:");
        int b = sc.nextInt();
        System.out.println(+a+ " + " +b+ " = " +(a+b));
        System.out.println(+a+ " - " +b+ " = " +(a-b));
        System.out.println(+a+ " * " +b+ " = " +(a*b));
        System.out.println(+a+ " / " +b+ " = " +(a/b));
        System.out.println(+a+ " mod " +b+ " = " +(a%b));
    }
}
