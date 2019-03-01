package android.layout.picsartapplication.model;

import android.graphics.Bitmap;

public class Profile {
    Bitmap profilePicture;
    Bitmap coverPicture;
    int followers;
    int following;
    int fans;
    boolean isOnline;

    public Profile(Bitmap profilePicture, Bitmap coverPicture, int followers, int following, int fans, boolean isOnline) {
        this.profilePicture = profilePicture;
        this.coverPicture = coverPicture;
        this.followers = followers;
        this.following = following;
        this.fans = fans;
        this.isOnline = isOnline;
    }

    public Bitmap getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(Bitmap profilePicture) {
        this.profilePicture = profilePicture;
    }

    public Bitmap getCoverPicture() {
        return coverPicture;
    }

    public void setCoverPicture(Bitmap coverPicture) {
        this.coverPicture = coverPicture;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public int getFans() {
        return fans;
    }

    public void setFans(int fans) {
        this.fans = fans;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }
}
