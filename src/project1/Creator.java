package project1;

import project1.defence.*;
import project1.heroes.*;
import project1.weapons.*;

import java.util.Scanner;

public class Creator {
    private static Attacks returnWeapon(int a){
        Attacks weapon = new Sword();
        switch (a){
            case 1: weapon = new Sword();break;
            case 2: weapon = new Bow();break;
            case 3: weapon = new Pitchfork();break;
            case 4: weapon = new RollingPin();break;
            case 5: weapon = new Rifle();break;
            case 6: weapon = new FireBreath();break;
        }
        return weapon;
    }
    private static Defends returnArmor(int a){
        Defends armor = new NoArmor();
        switch (a){
            case 1: armor = new LightArmor();break;
            case 2: armor = new HeavyArmor();break;
            case 3: armor = new NoArmor();break;
            case 4: armor = new ScalesArmor();break;
        }
        return armor;
    }

    public static Hero create(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your hero name:");
        String name = scan.nextLine();
        System.out.print("Choose your hero type:\n1.King\n2.Knight\n3.Cook\n4.Peasant\n5.Marine\n6.Elf\n7.Dragon\n");
        int choice = scan.nextInt();
        //System.out.println(choice);
        int weapon = 6;
        int armor = 4;
        if(choice!=7){
            System.out.print("Choose your weapon type:" +
                    "\n1.Sword\n2.Bow\n3.Pitchfork\n4.Rolling pin\n5.Rifle\n");
            weapon = scan.nextInt();
            System.out.print("Choose your armor type:" +
                    "\n1.Light armor\n2.Heavy armor\n3.No armor\n");
            armor = scan.nextInt();
        }
        //System.out.println(weapon);


        //placeholder for safety
        Hero hero = new Knight(returnWeapon(1), "Steve", returnArmor(armor));

        switch (choice){
            case 1 :{
                hero = new King(returnWeapon(weapon), name, returnArmor(armor));
                break;
            }
            case 2 :{
                hero = new Knight(returnWeapon(weapon), name, returnArmor(armor));
                break;
            }
            case 3 :{
                hero = new Cook(returnWeapon(weapon), name, returnArmor(armor));
                break;
            }
            case 4 :{
                hero = new Peasant(returnWeapon(weapon), name, returnArmor(armor));
                break;
            }
            case 5 :{
                hero = new Marine(returnWeapon(weapon), name, returnArmor(armor));
                break;
            }
            case 6 :{
                hero = new Elf(returnWeapon(weapon), name, returnArmor(armor));
                break;
            }
            case 7 :{
                hero = new Dragon(returnWeapon(weapon), name, returnArmor(armor));
                break;
            }
        }
        return hero;
    }
}
