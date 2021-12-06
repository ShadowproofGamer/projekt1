import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Hero> heroes = new ArrayList<>();
        //testy
        Hero myGuy = Creator.create();
        heroes.add(myGuy);
        System.out.println(myGuy);
        System.out.println(myGuy.getName());
        System.out.println(myGuy.weapon);
        myGuy.weapon.attack();
        myGuy.armor.defends();
    }
}
