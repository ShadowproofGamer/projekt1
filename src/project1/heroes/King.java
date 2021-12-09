package project1.heroes;

import project1.weapons.Attacks;
import project1.Hero;
import project1.*;
import project1.defence.*;
import project1.weapons.*;

public class King extends Hero {
    public King(Attacks weapon, String name, Defends defends){
        super(weapon, name, defends);
    }
}
