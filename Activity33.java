package lecture3;

import java.util.Scanner;

public class Activity33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào văn bản:");
        String str = sc.nextLine();
        String[] x = str.split(" ");
        int lmax = 0;
        for (int i = 0; i<x.length;i++){
            if(x[i].length()>lmax){
                lmax = x[i].length();
            }else{
                lmax = lmax;
            }
        }
        System.out.println("Các từ dài nhất trong chuỗi trên là: ");
        for (int i = 0; i<x.length;i++){
            if(x[i].length()==lmax){
                System.out.print(x[i]+" ");
            }
        }
    }
}
