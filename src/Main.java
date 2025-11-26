public class Main {
    public static void main(String[] args) {
        System.out.println(Player.playerCount);
        Player one = new Player("Tiger Woods");
        System.out.println(Player.playerCount);
        Player two = new Player("Krba");
        System.out.println(Player.playerCount);
        System.out.println("Of ref two" + two.getCount());
        System.out.println("Of ref one" + one.getCount());

        int x = Math.min(24, -240);
        double y = Math.max(987743.234, 987743.235);

    }
}