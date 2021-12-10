package project1.weapons;

import project1.Hero;

public class FireBreath implements Attacks {
    public void attack(Hero enemy) {
        System.out.println("Breathing with fire");
        int enemyHp = enemy.getHp();
        int overallDamage = enemy.defends(damage);
        if (overallDamage < 0) overallDamage = 0;
        System.out.println(enemy.getName() + " received " + overallDamage + " damage");
        enemy.setHp(enemyHp - overallDamage);
    }

    int damage = 40;

    public void showOff() {
        System.out.println("You demonstrated your dragon powers with a flame dealing " + damage + " damage");
        //
    }
}
