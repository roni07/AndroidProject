package android.layout.picsartapplication.model;

public class User {
    String email;
    String password;
    String userName;
    Profile profile;
    Post post;

    public User(String email, String password, String userName, Profile profile, Post post) {
        this.email = email;
        this.password = password;
        this.userName = userName;
        this.profile = profile;
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
