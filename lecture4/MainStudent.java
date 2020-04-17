package lecture4;
import java.util.Scanner;
public class MainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số sinh viên:");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];
        for (int i = 0; i<n; i++){
            System.out.println("Nhập vào sinh viên thứ "+(i+1)+": ");
            String thongTin = sc.nextLine();
            String[] thongTins = thongTin.split(" ");
            students[i] = new Student(thongTins[0],Integer.valueOf(thongTins[1]),Float.valueOf(thongTins[2]));
        }
        Student temp = null;
        for (int i = 0; i<n-1; i++){
            for (int j = i+1; j<n; j++){
                if(students[i].getDiem()<students[j].getDiem()){
                    temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        System.out.println("Danh sách sinh viên theo điểm giảm dần:");
        for (Student st:students){
            System.out.println("Tên: "+st.getTen()+" Tuổi: "+st.getTuoi()+" Điểm: "+st.getDiem());
        }
    }
}
