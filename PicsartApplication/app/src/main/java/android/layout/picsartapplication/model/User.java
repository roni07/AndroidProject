package android.layout.picsartapplication.model;

import java.util.ArrayList;

public class User {
    int userID;
    String email;
    String password;
    String userName;
    Profile profile;
    ArrayList<Post> postList;

    public User(int userID, String email, String password, String userName, Profile profile, ArrayList<Post> postList) {
        this.userID = userID;
        this.email = email;
        this.password = password;
        this.userName = userName;
        this.profile = profile;
        this.postList = postList;
    }

    public User(int userID, String email, String password, String userName, Profile profile) {
        this.userID = userID;
        this.email = email;
        this.password = password;
        this.userName = userName;
        this.profile = profile;
    }

    public User(String userName, Profile profile, ArrayList<Post> postList) {
        this.userName = userName;
        this.profile = profile;
        this.postList = postList;
    }

    public User(String userName) {
        this.userName = userName;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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

    public ArrayList<Post> getPostList() {
        return postList;
    }

    public void setPostList(ArrayList<Post> postList) {
        this.postList = postList;
    }
}
