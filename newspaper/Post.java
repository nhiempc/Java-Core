package newspaper;

public class Post {
    private int postID;
    private String postTitle;
    private String postContent;
    private String postSumary;
    private String postImage;
    private String postUploadDate;
    private int postView;
    private String postKeyword;
    private int postCategoryID;

    public Post(int postID, String postTitle, int postCategoryID) {
        this.postID = postID;
        this.postTitle = postTitle;
        this.postCategoryID = postCategoryID;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getPostSumary() {
        return postSumary;
    }

    public void setPostSumary(String postSumary) {
        this.postSumary = postSumary;
    }

    public String getPostImage() {
        return postImage;
    }

    public void setPostImage(String postImage) {
        this.postImage = postImage;
    }

    public String getPostUploadDate() {
        return postUploadDate;
    }

    public void setPostUploadDate(String postUploadDate) {
        this.postUploadDate = postUploadDate;
    }

    public int getPostView() {
        return postView;
    }

    public void setPostView(int postView) {
        this.postView = postView;
    }

    public String getPostKeyword() {
        return postKeyword;
    }

    public void setPostKeyword(String postKeyword) {
        this.postKeyword = postKeyword;
    }

    public int getPostCategoryID() {
        return postCategoryID;
    }

    public void setPostCategoryID(int postCategoryID) {
        this.postCategoryID = postCategoryID;
    }
}
