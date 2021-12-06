import weapons.Attacks;

public abstract class Hero {
    protected Attacks weapon;
    protected Defends armor;
    private String name;

    public Hero(Attacks weapon, String name, Defends armor) {
        setWeapon(weapon);
        setName(name);
        setArmor(armor);
    }


    public void setWeapon(Attacks weapon) {
        this.weapon = weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setArmor(Defends armor) {
        this.armor = armor;
    }
}
