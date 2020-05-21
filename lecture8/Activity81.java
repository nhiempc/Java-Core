package lecture8;

public class Activity81 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try {
            arr[5] = 4;
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("arr[5] = " + arr[5]);

        int zero = 0;
        int average = 10 / zero;
        System.out.println("Average = " + average);

        String obj = null;
        System.out.println(obj.length());

        System.out.println("Finished!");
    }
}
