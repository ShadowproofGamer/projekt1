package project1.weapons;

import project1.Hero;

public class Rifle implements Attacks {
    public void attack(Hero enemy) {
        int enemyHp = enemy.getHp();
        int overallDamage = enemy.getArmor().defends(damage);
        if (overallDamage<0) overallDamage=0;
        System.out.println("Firing 2 rounds:");
        System.out.println(enemy.getName()+" received "+overallDamage+" damage");
        enemy.setHp(enemyHp - overallDamage);
        System.out.println(enemy.getName()+" received "+overallDamage+" damage");
        enemy.setHp(enemyHp - overallDamage);
    }
    int damage = 17;
    public void showOff(){
        System.out.println("You fired a test round of bullets dealing "+damage+" damage");
        //
    }
}
