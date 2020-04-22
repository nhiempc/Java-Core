package lecture2;

import java.util.Scanner;

public class BinaryToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số nhị phân: ");
        int x = sc.nextInt();
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        StringBuilder bin = sb.reverse();
        String y = bin.toString();
        char[] binary = y.toCharArray();
        for(int i = 0; i<y.length(); i++){
            if(Character.toString(binary[i]).equals("1")){
                sum+=Math.pow(2,i);
            }else{
                sum+=0;
            }
        }
        System.out.println("Giá trị trong hệ thập phân là: "+sum);
    }
}
