package project1.defence;

public class LightArmor implements Defends {
    @Override
    public int defends(int damage) {
        return damage-2;
    }
}
