import java.util.Scanner;

public class CalSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số:");
        int number = sc.nextInt();
        System.out.println("Nhập vào n:");
        int n = sc.nextInt();
        long sum = 0;
        String str = "";
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                sum+=number*Math.pow(10,j-1);
            }
        }
        String string = "";
        for(int i=1;i<=n;i++){
            string+=Integer.toString(number);
            if(i==n){
                str+=string;
            }else{
                str+=string+" + ";
            }
        }
        System.out.println("Tổng của "+str+" là: " +sum);
    }
}
