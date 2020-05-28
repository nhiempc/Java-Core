package lecture8;

public class Activity81 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try {
            arr[5] = 4;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index không tồn tại!");
        }
        try {
            System.out.println("arr[5] = " + arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("arr[5] = không xác định!");
        }
        int zero = 0;
        try{
            int average = 10 / zero;
            System.out.println("Average = " + average);
        }catch (ArithmeticException e){
            System.out.println("Không thể chia cho số không!");
            System.out.println("Average = không xác định!");
        }
        try{
            String obj = null;
            System.out.println(obj.length());
        }catch (NullPointerException e){
            System.out.println("Không thể truy xuất đối tượng rỗng!");
            System.out.println("Kết thúc!");
        }

    }
}
