package lecture3;

public class Activity34 {
    public static void main(String[] args) {
        int[] a = {20, 20, 30, 40, 50, 50, 50};
        int n = a.length;
        System.out.println("Mảng cũ:");
        for (int i = 1; i < n; i++){
            System.out.print(a[i]+" ");
        }
        for (int i = 1; i < n; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (a[i] == a[j])
                {
                    for (int k = i; k < n; k++)
                    {
                        a[k] = a[k + 1];
                        n--;
                        i--;
                    }
                }
            }
        }
        System.out.println("\nMảng mới sau khi loại bỏ phần tử trùng lặp: ");
        for (int i = 0; i < n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nĐộ dài mới: "+n);
    }
}
