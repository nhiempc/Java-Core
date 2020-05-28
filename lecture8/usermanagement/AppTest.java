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
        if(!userManagement.checkExits(userName,userArray)){
            System.out.println("Không tìm thấy người dùng này!");
        }else {
            System.out.println("ID: "+findUserByUsername.getId()+"\nTên đăng nhập: "+findUserByUsername.getUsername()+"\nTên hiển thị: "+findUserByUsername.getDisplayName()+"\nEmail: "+findUserByUsername.getEmail());
        }
        System.out.println("Đăng Nhập:");
        String userNameLogin = "";
        do{
            System.out.println("Nhập tên đăng nhập: ");
            userNameLogin = sc.nextLine();
            if(!userManagement.checkExits(userNameLogin,userArray)){
                System.out.println("Sai tên đăng nhập!");
            }
        }while (!userManagement.checkExits(userNameLogin,userArray));
        String passwordLogin = "";
        do {
            System.out.println("Nhập mật khẩu: ");
            passwordLogin = sc.nextLine();
            if(!userManagement.checkPwExits(passwordLogin,userArray)){
                System.out.println("Sai mật khẩu!");
            }
        }while (!userManagement.checkPwExits(passwordLogin,userArray));
        User loginInfo = userManagement.login(userNameLogin,passwordLogin,userArray);
        System.out.println("Thông tin người dùng:");
        System.out.println("ID: "+loginInfo.getId()+"\nTên đăng nhập: "+loginInfo.getUsername()+"\nTên hiển thị: "+loginInfo.getDisplayName()+"\nEmail: "+loginInfo.getEmail());
    }
}
