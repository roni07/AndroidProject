package android.layout.picsartapplication.model;

import android.graphics.Bitmap;

public class Draw {
    int drawId;
    Bitmap draw;

    public Draw(int drawId, Bitmap draw) {
        this.drawId = drawId;
        this.draw = draw;
    }

    public int getDrawId() {
        return drawId;
    }

    public void setDrawId(int drawId) {
        this.drawId = drawId;
    }

    public Bitmap getDraw() {
        return draw;
    }

    public void setDraw(Bitmap draw) {
        this.draw = draw;
    }
}
