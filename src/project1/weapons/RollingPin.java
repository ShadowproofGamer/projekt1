package project1.weapons;

import project1.Hero;

public class RollingPin implements Attacks {
    public void attack(Hero enemy) {
        System.out.println("Annoying the neighbour");
        int enemyHp = enemy.getHp();
        int overallDamage = enemy.getArmor().defends(damage);
        if (overallDamage<0) overallDamage=0;
        System.out.println(enemy.getName()+" received "+overallDamage+" damage");
        enemy.setHp(enemyHp - overallDamage);
    }
    int damage = 1;
    public void showOff(){
        System.out.println("You threatened your neighbours with a rollingpin dealing "+damage+" damage");
        //
    }
}
