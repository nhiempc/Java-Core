public class Activity31 {
    public static void main(String[] args) {
        int[] a = {49, 1, 2, 200, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10, 11, 12};
        int l = 1, l_max = 1;
        int l_max_old = 1;
        for(int i = 0; i<a.length-1; i++){
            if(a[i+1]-a[i]==1){
                l+=1;
                l_max_old+=1;
                if(l_max_old>l_max){
                    l_max=l_max_old;
                }
            }else {
                l = 1;
                l_max = l_max_old;
                l_max_old = 1;
            }
        }
        System.out.println("Mảng:");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Độ dài liên tiếp lớn nhất trong mảng là: " +l_max);
    }
}
