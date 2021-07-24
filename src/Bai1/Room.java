package Bai1;

public abstract class Room {
    public final int costNomalRoom = 150000;
    public final int costVipRoom = 200000;
    private int cost;

    public Room() {
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
