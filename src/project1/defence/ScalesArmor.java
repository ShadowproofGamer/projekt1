package project1.defence;

public class ScalesArmor implements Defends {
    @Override
    public int defends(int damage) {
        return (int)(damage*0.5);
    }
}
