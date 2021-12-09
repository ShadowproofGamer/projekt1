package project1.weapons;

import project1.Hero;

public class Pitchfork implements Attacks {
    public void attack(Hero enemy) {
        System.out.println("Stabbing the enemy");
        int enemyHp = enemy.getHp();
        int overallDamage = enemy.getArmor().defends(damage);
        if (overallDamage<0) overallDamage=0;
        System.out.println(enemy.getName()+" received "+overallDamage+" damage");
        enemy.setHp(enemyHp - overallDamage);
    }
    int damage = 3;
    public void showOff(){
        System.out.println("A normal farmers pitchfork dealing "+damage+" damage");
        //
    }
}
