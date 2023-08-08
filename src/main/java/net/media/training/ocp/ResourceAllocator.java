package solid.live.ocp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 1:14:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class ResourceAllocator {
    final static private int INVALID_RESOURCE_ID = -1;
    public int allocate(Allocators allocator) {
        int resourceId = allocator.findFreeSlot();
        allocator.markSlotBusy(resourceId);
        return resourceId;
    }

    public void free(int resourceId) {
        allocator.markSlotFree(resourceId);
    }
}
interface Allocators {
    int findFreeSlot();

    void markSlotBusy(int resourceId);

    void markSlotFree(int resourceId);
}


