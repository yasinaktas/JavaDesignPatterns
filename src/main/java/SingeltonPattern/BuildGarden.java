package SingeltonPattern;

public class BuildGarden {
    private int treeCount;

    public BuildGarden(int treeCount) {
        this.treeCount = treeCount;
        System.out.println("The garden is builded with " + treeCount + " trees.");
    }

    public int getTreeCount() {
        return treeCount;
    }

    public void setTreeCount(int treeCount) {
        this.treeCount = treeCount;
    }

    public void tryGameWorld(){
        GameWorld world = GameWorld.getInstance();
        System.out.println(world.getTimeCreated());
    }
}
