package lecture8.usermanagement;

import java.util.ArrayList;
import java.util.List;
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
        for (int i=0;i<users.length;i++){
            if(users[i].getUsername().equals(username)){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
    public User findUserByUsername(String username,User[] user){
        for (int i=0;i<user.length;i++){
            if(user[i].getUsername().equals(username)){
                return user[i];
            }else {
              return null;
            }
        }
        return null;
    }
    public void login(String userName,String password,User[] user){

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
