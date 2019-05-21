package android.layout.picsartapplication.model;

import android.graphics.Bitmap;

import java.util.ArrayList;

public class Edit {
    User user;
    ArrayList<Photos> photoList;
    ArrayList<Draw> drawingList;
    ArrayList<Background> backgroundList;
    ArrayList<FreePhoto> freePhotoList;

    public Edit(User user, ArrayList<Photos> photoList, ArrayList<Draw> drawingList, ArrayList<Background> backgroundList, ArrayList<FreePhoto> freePhotoList) {
        this.user = user;
        this.photoList = photoList;
        this.drawingList = drawingList;
        this.backgroundList = backgroundList;
        this.freePhotoList = freePhotoList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Photos> getPhotoList() {
        return photoList;
    }

    public void setPhotoList(ArrayList<Photos> photoList) {
        this.photoList = photoList;
    }

    public ArrayList<Draw> getDrawingList() {
        return drawingList;
    }

    public void setDrawingList(ArrayList<Draw> drawingList) {
        this.drawingList = drawingList;
    }

    public ArrayList<Background> getBackgroundList() {
        return backgroundList;
    }

    public void setBackgroundList(ArrayList<Background> backgroundList) {
        this.backgroundList = backgroundList;
    }

    public ArrayList<FreePhoto> getFreePhotoList() {
        return freePhotoList;
    }

    public void setFreePhotoList(ArrayList<FreePhoto> freePhotoList) {
        this.freePhotoList = freePhotoList;
    }
}
