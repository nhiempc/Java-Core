import java.util.Scanner;

public class DectoHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên: ");
        int x = sc.nextInt();
        int y=x;
        int z=x;
        String hex = "";
        while (z!=0){
            z = y%16;
            y = y/16;
            switch (z){
                case 10:
                    hex+="A";
                    break;
                case 11:
                    hex+="B";
                    break;
                case 12:
                    hex+="C";
                    break;
                case 13:
                    hex+="D";
                    break;
                case 14:
                    hex+="E";
                    break;
                case 15:
                    hex+="F";
                    break;
                case 0:
                    hex+="";
                    break;
                default:
                    hex+=z;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(hex);
        System.out.println("Tập lục phân của "+x+" là: " +sb.reverse());
    }
}
