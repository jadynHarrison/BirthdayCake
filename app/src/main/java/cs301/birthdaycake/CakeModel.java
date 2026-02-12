package cs301.birthdaycake;

public class CakeModel {

    public float touchX = -1;

    public float touchY = -1;

    public boolean hasTouch = false;

    public boolean candlesLit;
    public int numCandles;
    public boolean hasFrosting;
    public boolean hasCandles;

    // Person B : Variables for Balloon
    public float balloonX;
    public float balloonY;
    public boolean hasBalloon = false;


    public CakeModel() {
        candlesLit = true;
        numCandles = 2;
        hasFrosting = true;
        hasCandles = true;
    }
}
