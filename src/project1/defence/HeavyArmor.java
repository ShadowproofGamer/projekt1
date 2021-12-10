package project1.defence;

public class HeavyArmor implements Defends {
    @Override
    public int defends(int damage) {
        return (int) ((damage - 5) * 0.9);
    }
}
