package rectangle;

public class Handle {
    public int Perimeter(int width, int height){
        return 2*(width+height);
    }
    public int Acreage(int width,int height){
        return width*height;
    }
    public void printWidth(int width){
        System.out.println("Width: "+width);
    }
    public void printHeight(int height){
        System.out.println("Height: "+height);
    }
    public void checkSquare(int width, int height){
        if (width==height){
            System.out.println("Is square!");
        }else {
            System.out.println("Is rectangle!");
        }
    }
}
