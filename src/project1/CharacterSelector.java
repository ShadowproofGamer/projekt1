package project1;

import java.util.List;
import java.util.Scanner;

public class CharacterSelector {
    public static Hero select(List<Hero> hero){
        Scanner scan = new Scanner(System.in);
        int i = 1;
        System.out.println("choose your hero:");
        for (Hero character: hero){
            System.out.println(i+". "+character.getName()
            //+" "+character.armor+"  "+character.weapon+"  "+character.getClass()
            );
            i++;
        }
        int choice = scan.nextInt();
        while (!(choice > 0 && choice <= hero.size())){
            System.out.println("Sorry your input was incorrect. Try again:");
            choice = scan.nextInt();
        }
        return hero.get(choice-1);
    }
}
