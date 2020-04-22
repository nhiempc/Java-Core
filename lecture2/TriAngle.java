package lecture2;

import java.util.Scanner;

public class TriAngle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng:");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            // in ky tu khoang trang
            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // in ky tu ngoi sao
            for(int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
