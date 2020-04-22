package lecture2;

import java.util.Scanner;

public class NumberToBinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số:");
        int x = sc.nextInt();
        int bin_charater;
        int divided_number = x;
        String bin_number = "";
        while (divided_number!=0){
            bin_charater = divided_number%2;
            divided_number = divided_number/2;
            bin_number+=bin_charater;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(bin_number);
        System.out.println("Nhị phân của "+x+" là: " +sb.reverse());
    }
}
