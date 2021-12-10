package project1;

import project1.defence.Defends;
import project1.weapons.Attacks;

public abstract class Hero {
    protected Attacks weapon;
    protected Defends armor;
    private String name;
    private int hp = 1;


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

    public Defends getArmor() {
        return armor;
    }

    public int defends(int damage) {
        return armor.defends(damage);
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void attack(Hero enemy) {
        weapon.attack(enemy);
    }

    public void weaponShowOff() {
        weapon.showOff();
    }
}
