import java.util.ArrayList;
import java.util.List;

public class Activity23 {
    public static void main(String[] args){
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list5 = new ArrayList<>();
        List<Integer> list35 = new ArrayList<>();
        for(int i = 1;i<100;i++){
            if(i%3==0){
                list3.add(i);
            }
            if(i%5==0){
                list5.add(i);
            }
            if(i%3==0&&i%5==0){
                list35.add(i);
            }
        }
        System.out.println("Divided by 3: " +list3);
        System.out.println("Divided by 5: " +list5);
        System.out.println("Divided by 3 & 5: " +list35);
    }
}
