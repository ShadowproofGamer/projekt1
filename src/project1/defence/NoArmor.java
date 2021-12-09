package project1.defence;

public class NoArmor implements Defends {
    @Override
    public int defends(int damage) {
        return damage;
    }
}
