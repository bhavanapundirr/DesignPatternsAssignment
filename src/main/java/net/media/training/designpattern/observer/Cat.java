package net.media.training.designpattern.observer;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 20, 2011
 * Time: 10:13:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Cat implements SunObserver {
    private boolean outdoors;
    private boolean feelingWarm;
    private boolean feelingTired;

    public boolean isFeelingWarm() {
        return feelingWarm;
    }

    public void goOutdoors() {
        outdoors = true;
    }

    public void goIndoors() {
        outdoors = false;
    }

    public boolean isOutdoors() {
        return outdoors;
    }



    public boolean isFeelingTired() {
        return feelingTired;
    }
    @Override
    public void notifySunRose() {
        feelingWarm = true;
    }

    @Override
    public void notifySunSet() {
        feelingWarm = false;
        if (outdoors)
            feelingTired = true;
    }
}