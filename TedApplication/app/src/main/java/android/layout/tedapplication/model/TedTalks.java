package android.layout.tedapplication.model;

public class TedTalks {
    int thumbNailPic;
    String videoTime;
    TedUser tedUser;
    String talksCaption;
    int like;
    int share;

    public TedTalks(int thumbNailPic, String videoTime, TedUser tedUser, String talksCaption) {
        this.thumbNailPic = thumbNailPic;
        this.videoTime = videoTime;
        this.tedUser = tedUser;
        this.talksCaption = talksCaption;
    }

    public int getThumbNailPic() {
        return thumbNailPic;
    }

    public void setThumbNailPic(int thumbNailPic) {
        this.thumbNailPic = thumbNailPic;
    }

    public String getVideoTime() {
        return videoTime;
    }

    public void setVideoTime(String videoTime) {
        this.videoTime = videoTime;
    }

    public TedUser getTedUser() {
        return tedUser;
    }

    public void setTedUser(TedUser tedUser) {
        this.tedUser = tedUser;
    }

    public String getTalksCaption() {
        return talksCaption;
    }

    public void setTalksCaption(String talksCaption) {
        this.talksCaption = talksCaption;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getShare() {
        return share;
    }

    public void setShare(int share) {
        this.share = share;
    }
}
