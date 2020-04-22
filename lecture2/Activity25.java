package lecture2;

import java.util.Scanner;

public class Activity25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số: ");
        int n = sc.nextInt();
        long sum1 = 0;
        long sum2 = 0;
        long sum3 = 0;
        System.out.println("Cách 1: Dùng for");
        for (int i=1;i<=n;i++){
            sum1+=i;
        }
        System.out.println("Tổng "+n+" số đầu tiên là:"+sum1);
        System.out.println("Trung bình cộng là: "+(float)sum1/n);
        System.out.println("======================================");
        System.out.println("Cách 2: Dùng while");
        int i = 1;
        while (i<=n){
            sum2+=i;
            i+=1;
        }
        System.out.println("Tổng "+n+" số đầu tiên là:"+sum2);
        System.out.println("Trung bình cộng là: "+(float)sum2/n);
        System.out.println("======================================");
        System.out.println("Cách 3: Dùng do-while");
        int t = 1;
        do{
            sum3+=t;
            t++;
        }while (t>=1&&t<=n);
        System.out.println("Tổng "+n+" số đầu tiên là:"+sum3);
        System.out.println("Trung bình cộng là: "+(float)sum3/n);
    }
}
