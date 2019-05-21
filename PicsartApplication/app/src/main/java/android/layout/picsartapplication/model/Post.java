package android.layout.picsartapplication.model;

import java.util.ArrayList;

public class Post {
    int imagePost;
    int like;
    int commentCounter;
    int remixes;
    ArrayList<String> comments;
    String caption;
    String uploadTime;
    User user;
    Profile profile;

    public Post(int imagePost, int like, int commentCounter, ArrayList<String> comments, String caption, String uploadTime) {
        this.imagePost = imagePost;
        this.like = like;
        this.commentCounter = commentCounter;
        this.comments = comments;
        this.caption = caption;
        this.uploadTime = uploadTime;
    }

    public Post(int imagePost, int like, int commentCounter, User user, Profile profile, int remixes) {
        this.imagePost = imagePost;
        this.like = like;
        this.commentCounter = commentCounter;
        this.user = user;
        this.profile = profile;
        this.remixes = remixes;

    }

    public int getImagePost() {
        return imagePost;
    }

    public void setImagePost(int imagePost) {
        this.imagePost = imagePost;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getCommentCounter() {
        return commentCounter;
    }

    public void setCommentCounter(int commentCounter) {
        this.commentCounter = commentCounter;
    }

    public ArrayList<String> getComments() {
        return comments;
    }

    public void setComments(ArrayList<String> comments) {
        this.comments = comments;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public int getRemixes(){
        return remixes;
    }

    public void setRemixes(int remixes){
        this.remixes = remixes;
    }
}
