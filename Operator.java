import java.util.Scanner;

public class Operator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất:");
        int a = sc.nextInt();
        System.out.println("Nhập số thứ hai:");
        int b = sc.nextInt();
        int sum = a+b;
        int mul = a*b;
        System.out.println("The sum of " +a+ "+" +b+ " is: " +sum);
        System.out.println("The product of " +a+ "*" +b+ " is: " +mul);
    }
}
