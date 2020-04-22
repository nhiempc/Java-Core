package lecture3;

import java.util.ArrayList;
import java.util.List;

public class Activity32 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {2,5,7,8};
        List<Integer> c = new ArrayList<>();
        for (int i = 0;i<a.length;i++){
            c.add(a[i]);
        }
        for (int i = 0;i<b.length;i++){
            c.add(b[i]);
        }
        Integer[] arr = new Integer[c.size()];
        arr = c.toArray(arr);
        sort(arr);
        for(Integer i : arr){
            System.out.print(i+" ");
        }
    }
    public static void sort(Integer[] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
