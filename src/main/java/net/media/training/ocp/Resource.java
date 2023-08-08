package solid.live.ocp;

public abstract class Resource {
    private boolean isBusy;

    public boolean isBusy() {
        return isBusy;
    }

    public void markBusy() {
        isBusy = true;
    }

    public void markFree() {
        isBusy = false;
    }
}
