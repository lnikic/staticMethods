public class Player {
    static int playerCount;
    private String name;
    public static final int NUMBER = 11;

    public Player(String n) {
        name = n;
        playerCount++;
    }
    public int getCount() {
        return playerCount;
    }
}
