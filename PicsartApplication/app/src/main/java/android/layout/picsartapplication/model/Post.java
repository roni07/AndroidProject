package android.layout.picsartapplication.model;

import java.time.LocalDateTime;

public class Post {
    int like;
    int commentsCounter;
    String comments;
    String caption;
    LocalDateTime uploadDateTime;

    public Post(int like, int commentsCounter, String comments, String caption, LocalDateTime uploadDateTime) {
        this.like = like;
        this.commentsCounter = commentsCounter;
        this.comments = comments;
        this.caption = caption;
        this.uploadDateTime = uploadDateTime;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getCommentsCounter() {
        return commentsCounter;
    }

    public void setCommentsCounter(int commentsCounter) {
        this.commentsCounter = commentsCounter;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public LocalDateTime getUploadDateTime() {
        return uploadDateTime;
    }

    public void setUploadDateTime(LocalDateTime uploadDateTime) {
        this.uploadDateTime = uploadDateTime;
    }
}
