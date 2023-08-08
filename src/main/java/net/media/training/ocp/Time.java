package solid.live.ocp;
class Time implements Allocators {
    @Override
    public int findFreeSlot() {
        return 0;
    }

    @Override
    public void markSlotFree(int resourceId) {
    }

    @Override
    public void markSlotBusy(int resourceId) {
    }
}

