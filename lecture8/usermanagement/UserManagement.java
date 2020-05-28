package lecture8.usermanagement;
import java.util.Scanner;

public class UserManagement {
    private int totalUser;
    private User[] users;

    public UserManagement() {

    }
    public User[] input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số user:");
        int totalUser = sc.nextInt();
        User[] userArray = new User[totalUser];
        for (int i=0;i<userArray.length;i++){
            userArray[i] = new User();
            System.out.println("Nhập vào user thứ "+(i+1)+" : ");
            System.out.println("Nhập ID: ");
            int id = sc.nextInt();
            userArray[i].setId(id);
            sc.nextLine();
            System.out.println("Nhập User Name: ");
            String userName = sc.nextLine();
            userArray[i].setUsername(userName);
            System.out.println("Nhập Password: ");
            String password = sc.nextLine();
            userArray[i].setPassword(password);
            System.out.println("Nhập Display Name: ");
            String displayName = sc.nextLine();
            userArray[i].setDisplayName(displayName);
            System.out.println("Nhập Email: ");
            String email = sc.nextLine();
            userArray[i].setEmail(email);
        }
        return userArray;
    }
    public boolean checkExits(String username,User[] users){
        boolean kq = false;
        for (int i=0;i<users.length;i++){
            if(users[i].getUsername().equals(username)){
                kq = true;
            }else {
                kq =  false;
            }
        }
        return kq;
    }
    public boolean checkPwExits(String username,User[] users){
        boolean kq = false;
        for (int i=0;i<users.length;i++){
            if(users[i].getPassword().equals(username)){
                kq = true;
            }else {
                kq = false;
            }
        }
        return kq;
    }
    public User findUserByUsername(String username,User[] user){
        User user1 = new User();
        for (int i=0;i<user.length;i++){
            if(user[i].getUsername().compareTo(username)==0){
                user1 = user[i];
            }else {
              user1 = null;
            }
        }
        return user1;
    }
    public User login(String userName,String password,User[] user){
        User user1 = new User();
        for (int i=0;i<user.length;i++){
            if(user[i].getUsername().equals(userName)&&user[i].getPassword().equals(password)){
                System.out.println("Đăng nhập thành công!");
                user1 = user[i];
            }else{
                user1 = null;
            }
        }
        return user1;
    }
    public int getTotalUser() {
        return totalUser;
    }

    public void setTotalUser(int totalUser) {
        this.totalUser = totalUser;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }
}
