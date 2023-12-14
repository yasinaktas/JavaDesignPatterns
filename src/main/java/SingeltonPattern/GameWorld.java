package SingeltonPattern;

public class GameWorld {

    private static GameWorld instance;
    private static long timeCreated;

    private GameWorld() {
        System.out.println("Oyun Dünyası Oluşturuldu");
        timeCreated = System.currentTimeMillis();
    }

    public static GameWorld getInstance(){
        if(instance == null){
            instance = new GameWorld();
        }
        return instance;
    }

    public long getTimeCreated(){
        return timeCreated;
    }

}
