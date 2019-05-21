package android.layout.picsartapplication.model;

import android.graphics.Bitmap;

public class FreePhoto {
    int freePhotoId;
    Bitmap freePhoto;

    public FreePhoto(int freePhotoId, Bitmap freePhoto) {
        this.freePhotoId = freePhotoId;
        this.freePhoto = freePhoto;
    }

    public int getFreePhotoId() {
        return freePhotoId;
    }

    public void setFreePhotoId(int freePhotoId) {
        this.freePhotoId = freePhotoId;
    }

    public Bitmap getFreePhoto() {
        return freePhoto;
    }

    public void setFreePhoto(Bitmap freePhoto) {
        this.freePhoto = freePhoto;
    }
}
