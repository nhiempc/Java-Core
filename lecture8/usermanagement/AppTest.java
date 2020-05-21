package lecture8.usermanagement;
import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserManagement userManagement = new UserManagement();
        User[] userArray = userManagement.input();
        System.out.println("Nhập User Name cần tìm: ");
        String userName = sc.nextLine();
        User findUserByUsername = userManagement.findUserByUsername(userName,userArray);
        System.out.println("Kết quả tìm kiếm: ");
        System.out.println(findUserByUsername.getId()+" "+findUserByUsername.getUsername()+" "+findUserByUsername.getDisplayName()+" "+findUserByUsername.getEmail());
        System.out.println("Đăng Nhập:");
        String userNameLogin = "";
        do{
            System.out.println("Nhập tên đăng nhập: ");
            userNameLogin = sc.nextLine();
        }while (userManagement.checkExits(userNameLogin,userArray));
        String passwordLogin = "";
        do {
            System.out.println("Nhập mật khẩu: ");
            passwordLogin = sc.nextLine();
        }while (userManagement.checkPwExits(passwordLogin,userArray));
    }
}
