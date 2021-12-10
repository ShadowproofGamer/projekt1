package project1;

import java.util.Random;

public class EventsGenerator {
    public static Hero generateEvent() {
        Random myRandom = new Random();
        int happening = myRandom.nextInt(5);
        int heroType = myRandom.nextInt(7);
        int weapon = myRandom.nextInt(5);
        int armor = myRandom.nextInt(3);
        int number = myRandom.nextInt(10000);
        Hero enemy = null;
        switch (happening) {
            case 1:
                System.out.println("Nothing happens...\n");
                break;
            case 2:
                System.out.println("You enter a dangerous place\n");
                enemy = Creator.generate(heroType, weapon, armor, "enemy" + number);
                break;
            case 3:
                System.out.println("You went for a nice walk");
                break;
            default:
                System.out.println("You enter a dangerous neighbourhood\n");
                enemy = Creator.generate(3, 4, 3, "enemy" + number);
                break;
        }

        return enemy;
    }
}
