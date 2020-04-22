package lecture1;

import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một só:");
        int number = sc.nextInt();
        System.out.println("Bảng nhân của "+number+" là:");
        for(int i = 1;i<11;i++){
            System.out.println(+number+" * " +i+ " = " +(number*i));
        }
    }
}
