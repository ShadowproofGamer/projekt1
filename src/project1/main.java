package project1;

import com.sun.org.apache.xpath.internal.objects.XNull;
import project1.Creator;
import project1.Hero;
import project1.defence.NoArmor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    private static List<Hero> heroes = new ArrayList<>();

    public static void main(String[] args) {
        mainLoop();
        System.out.println("\nThank you for playing!");
    }

    public static void mainLoop() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You have to create new character.");
        Hero currentCharacter = Creator.create();
        heroes.add(currentCharacter);
        Hero enemy = null;
        int exitLoop = 0;

        while (exitLoop != 1) {
            int exitMainMenu = 0;
            int exitGame = 0;
            //creating character if there isn't one:
            if (heroes.isEmpty()) {
                System.out.println("You have to create new character");
                currentCharacter = Creator.create();
                heroes.add(currentCharacter);
            }
            if (currentCharacter==null){
                currentCharacter = CharacterSelector.select(heroes);
            }
            while (exitMainMenu != 1) {
                //1. choose character
                //2. create character
                //3. start the game
                //4. exit
                System.out.println("\nMain menu:\n1. Choose character\n2. Create character\n3. Start the game\n4. Exit\n");
                int tempChoice = scan.nextInt();
                if (tempChoice == 1) {
                    currentCharacter = CharacterSelector.select(heroes);
                } else if (tempChoice == 2) {
                    heroes.add(Creator.create());
                } else if (tempChoice == 3) {
                    exitMainMenu = 1;
                } else if (tempChoice == 4) {
                    exitMainMenu = 1;
                    exitGame = 1;
                    exitLoop = 1;
                }
            }
            //game:
            if (exitGame != 1)
                System.out.println("Welcome in the game, you're playing the character called " + currentCharacter.getName());
            while (exitGame != 1) {
                if (enemy != null) System.out.println("There is an enemy on your way!");
                System.out.println("\nChoose your next action:");
                System.out.println("1. Go straight for the adventure!");
                System.out.println("2. Show off your weapon");
                if (enemy != null) System.out.println("3. Fight");
                System.out.println("4. Exit");
                int tempChoice = scan.nextInt();

                if (tempChoice == 1) {
                    enemy = EventsGenerator.generateEvent();
                } else if (tempChoice == 2) {
                    System.out.println("\nShowing off your weapon:");
                    currentCharacter.weapon.showOff();
                } else if (tempChoice == 3 && enemy != null) {
                    System.out.println("\nThe battle begins!");
                    while(currentCharacter.getHp()>0 && enemy.getHp()>0){
                        currentCharacter.weapon.attack(enemy);
                        if (enemy.getHp()>0) enemy.weapon.attack(currentCharacter);
                    }
                    if (currentCharacter.getHp()<=0) {
                        System.out.println("\nSorry you have lost... Game over\n");
                        heroes.remove(currentCharacter);
                        currentCharacter=null;
                        exitGame = 1;
                    }
                    else if (enemy.getHp()<=0){
                        System.out.println("\nYou've won... Congratulations!");
                        System.out.println(currentCharacter.getHp()+" HP left\n");
                        enemy=null;
                    }
                } else if (tempChoice == 4) {
                    exitGame = 1;
                }
            }
        }
    }
}
