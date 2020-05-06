package rectangle;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Nhập vào width: ");
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        System.out.println("Nhập vào height: ");
        int height = sc.nextInt();
        Rectangle hcn = new Rectangle();
        hcn.setWidth(width);
        hcn.setHeight(height);
        hcn.printWidth(hcn.getWidth());
        hcn.printHeight(hcn.getHeight());
        System.out.println("Chu vi: "+hcn.Perimeter(hcn.getWidth(),hcn.getHeight()));
        System.out.println("Diện tích: "+hcn.Acreage(hcn.getWidth(),hcn.getHeight()));
        hcn.checkSquare(hcn.getWidth(),hcn.getHeight());
    }
}
