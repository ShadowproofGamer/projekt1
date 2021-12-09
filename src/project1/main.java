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

        //testy
        //Hero myGuy = Creator.create();
        //heroes.add(myGuy);
        //System.out.println(myGuy);
        //System.out.println(myGuy.getName());
        //System.out.println(myGuy.weapon);
        //myGuy.weapon.attack();
        //myGuy.armor.defends();
        //System.out.println(heroes);
        mainLoop();
        System.out.println("\nThank you for playing!");
    }

    public static void mainLoop() {
        Scanner scan = new Scanner(System.in);
        Hero currentCharacter = Creator.create();
        heroes.add(currentCharacter);
        Hero enemy = null;
        int exitLoop = 0;
        while (exitLoop != 1) {
            int exitMainMenu = 0;
            int exitGame = 0;
            //tworzenie postaci jeśli jeszcze żadnej nie ma:
            if (heroes.isEmpty()) {
                currentCharacter = Creator.create();
                heroes.add(currentCharacter);
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
            //gra:
            if (exitGame != 1)
                System.out.println("Welcome in the game, you're playing the character called " + currentCharacter.getName());
            while (exitGame != 1) {
                System.out.println("Choose your next action:");
                System.out.println("1. Go straight for the adventure!");
                System.out.println("2. Show off your weapon");
                System.out.println("3. Fight");
                System.out.println("4. Exit");
                //chodzenie po grze i walka
                //prezentowanie broni
                int tempChoice = scan.nextInt();
                if (tempChoice == 1) {
                    System.out.println("Something happens");
                } else if (tempChoice == 2) {
                    System.out.println("Showing off your weapon:");
                    currentCharacter.weapon.showOff();
                } else if (tempChoice == 3) {
                    System.out.println("The battle begins!");
                    currentCharacter.weapon.attack();
                } else if (tempChoice == 4) {
                    exitGame = 1;
                }
            }
        }

    }
}
