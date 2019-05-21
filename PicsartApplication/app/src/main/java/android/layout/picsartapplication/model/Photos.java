package android.layout.picsartapplication.model;

import android.graphics.Bitmap;

public class Photos {
    int photoId;
    Bitmap photo;

    public Photos(int photoId, Bitmap photo) {
        this.photoId = photoId;
        this.photo = photo;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public Bitmap getPhoto() {
        return photo;
    }

    public void setPhoto(Bitmap photo) {
        this.photo = photo;
    }
}
