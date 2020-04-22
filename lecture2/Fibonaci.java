package lecture2;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số: ");
        int x = sc.nextInt();
        System.out.println(x+" số Fibonaci đầu tiên là:");
        for(int i = 0;i < x; i++){
            System.out.print(fn(i)+" ");
        }
    }
    public static long fn(int n) {
        if(n==0){
            return 0;
        }
        else if ((n == 1) || (n == 2)) {
            return 1;
        } else {
            long arr[] = new long[n];
            arr[0] = 1;
            arr[1] = 1;
            for (int i = 2; i < arr.length; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            return arr[n-1];
        }
    }
}
