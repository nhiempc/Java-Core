package newspaper;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Dữ liệu test đầu vào
        Post[] news = new Post[5];
        news[0] = new Post(1,"A",1);
        news[1] = new Post(2,"B",2);
        news[2] = new Post(3,"C",1);
        news[3] = new Post(4,"D",4);
        news[4] = new Post(5,"E",1);
        //Kết quả đầu ra
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào ID thể loại muốn tìm:");
        int category_id = sc.nextInt();
        List<Post> kq = findByCategory(category_id,news);
        if(kq.size()==0){
            System.out.println("Không tìm thấy!");
        }else{
            System.out.println("Những bài viết có ID thể loại là "+category_id+":");
            for (Post n: kq){
                System.out.println("ID: "+n.getPostID()+" Tiêu đề: "+n.getPostTitle());
            }
        }
        System.out.println("Nhập ID bài viết cần chỉnh sửa:");
        int post_id = sc.nextInt();
        updatePost(post_id,news);
    }
    public static void updatePost(int post_id,Post[] posts){
        int index = 0;
        for (int i=0;i<posts.length;i++){
            if(posts[i].getPostID()==post_id){
                index = i;
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhập dữ liệu mới(Enter khi không cần sửa):");
                System.out.println("Nhập tên:");
                String name = sc.nextLine();
                if(name.equalsIgnoreCase("")){
                    posts[i].setPostTitle(posts[i].getPostTitle()) ;
                }else {
                    posts[i].setPostTitle(name);
                }
                System.out.println("Nhập ID thể loại:");
                String categoryID = sc.nextLine();
                if(categoryID.equalsIgnoreCase("")){
                    posts[i].setPostCategoryID(posts[i].getPostCategoryID());
                }else {
                    posts[i].setPostCategoryID(Integer.parseInt(categoryID));
                }
            }
        }
        System.out.println("Thông tin bài viết sau khi đã chỉnh sửa:");
        System.out.println("ID: "+posts[index].getPostID()+" Tiêu đề: "+posts[index].getPostTitle()+" ID thể loại: "+posts[index].getPostCategoryID());
    }
    public static List<Post> findByCategory(int category_id, Post[] posts){
        List<Post> post = new ArrayList<>();
        for (Post p: posts){
            if(p.getPostCategoryID()==category_id){
                post.add(p);
            }
        }
        return post;
    }
}
