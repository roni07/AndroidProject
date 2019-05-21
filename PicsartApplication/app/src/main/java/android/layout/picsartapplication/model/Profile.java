package android.layout.picsartapplication.model;

import android.graphics.Bitmap;

public class Profile {
    int profilePicture;
    int coverPicture;
    int followers;
    int following;
    int fans;
    boolean isOnline;

    public Profile(int profilePicture, int coverPicture, int followers, int following, int fans, boolean isOnline) {
        this.profilePicture = profilePicture;
        this.coverPicture = coverPicture;
        this.followers = followers;
        this.following = following;
        this.fans = fans;
        this.isOnline = isOnline;
    }

    public Profile(int profilePicture) {
        this.profilePicture = profilePicture;
    }

    public int getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(int profilePicture) {
        this.profilePicture = profilePicture;
    }

    public int getCoverPicture() {
        return coverPicture;
    }

    public void setCoverPicture(int coverPicture) {
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
