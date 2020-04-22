package lecture2;

import java.util.Scanner;

public class Activity28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất:");
        int a = sc.nextInt();
        System.out.println("Nhập vào số thứ hai:");
        int b = sc.nextInt();
        int sum = 0;
        if(a<b){
            for(int i = 0; i < a; i++){
                sum+=b;
            }
        }else{
            for(int i = 0; i < b; i++){
                sum+=a;
            }
        }
        System.out.println("Tích của "+a+" và "+b+" là: " +sum);
    }
}
