package project1.weapons;

import project1.Hero;
import project1.defence.NoArmor;

public class Sword implements Attacks {
    public void attack(Hero enemy) {
        System.out.println("Slashing the enemy");
        int enemyHp = enemy.getHp();
        int overallDamage = enemy.defends(damage);
        if (overallDamage < 0) overallDamage = 0;
        System.out.println(enemy.getName() + " received " + overallDamage + " damage");
        enemy.setHp(enemyHp - overallDamage);
    }

    int damage = 9;

    public void showOff() {
        System.out.println("You showed off your shiny sword dealing " + damage + " damage");
        //
    }
}
