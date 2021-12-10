package project1.weapons;

import project1.Hero;

public class Bow implements Attacks {

    public void attack(Hero enemy) {
        System.out.println("Firing arrow");
        int enemyHp = enemy.getHp();
        int overallDamage = enemy.defends(damage);
        if (overallDamage < 0) overallDamage = 0;
        System.out.println(enemy.getName() + " received " + overallDamage + " damage");
        enemy.setHp(enemyHp - overallDamage);
    }

    int damage = 7;

    public void showOff() {
        System.out.println("An excellent bow dealing " + damage + " damage");
        //
    }
}
