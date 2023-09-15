package encap.sample;

public class Room {
    public static void main(String[] args) {
        EncapsulationExample table2 = new EncapsulationExample();
        Player p1 = new Player("Marc",2541,2_000);
        Player p2 = new Player("Clark",2551,12_000);
        System.out.println(p1);
        table2.setNumCards(9);
        System.out.println(table2.getNumCards());
    }
}
class Player{
    public Player(String name, int idPlayer, int money) {
        this.name = name;
        this.idPlayer = idPlayer;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getIdPlayer() {
        return idPlayer;
    }

    private int idPlayer;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    private int money;

}