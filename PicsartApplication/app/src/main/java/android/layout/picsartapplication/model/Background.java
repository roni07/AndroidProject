package android.layout.picsartapplication.model;

import android.graphics.Bitmap;

public class Background {
    int backgroundId;
    Bitmap backgroundImage;

    public Background(int backgroundId, Bitmap backgroundImage) {
        this.backgroundId = backgroundId;
        this.backgroundImage = backgroundImage;
    }

    public int getBackgroundId() {
        return backgroundId;
    }

    public void setBackgroundId(int backgroundId) {
        this.backgroundId = backgroundId;
    }

    public Bitmap getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(Bitmap backgroundImage) {
        this.backgroundImage = backgroundImage;
    }
}
