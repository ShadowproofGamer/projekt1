package project1.weapons;

import project1.defence.NoArmor;

public class Sword implements Attacks {
    public void attack() {
        //
        System.out.println("Atakuje");
        //if (!(enemy.armor instanceof NoArmor)){
        //
        //}
    }
    int damage = 9;
    public void showOff(){
        System.out.println("You showed off your shiny sword dealing "+damage+" damage");
        //
    }
}
