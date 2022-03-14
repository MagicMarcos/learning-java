package play.game.client;

import play.game.FightingGameCharacter;
import play.game.Professions;

/**
 * Client class for running fighting game character simulation
 */
class FightingGameCharacterClient {
        public static void main(String[] args) {
                // char 1
                FightingGameCharacter ryu = new FightingGameCharacter("Ryu", "Hadouken" , 96.9);
                ryu.setAttackPower(100);
                ryu.setDefense(90);
                ryu.setOverallStats(99.2);
                ryu.setHealth(200);
                ryu.setUnlocked(true);

                ryu.specialMove();
                ryu.attack();
                ryu.jump();

                System.out.println(ryu);

                // char 2
                FightingGameCharacter goku = new FightingGameCharacter("Goku", "Kamehameha", 98.0);
                goku.setAttackPower(150);
                goku.setDefense(70);
                goku.setOverallStats(99.8);
                goku.setHealth(210);
                goku.setUnlocked(true);
                goku.setProfession(Professions.WARRIOR);

                goku.specialMove();
                goku.attack();

                System.out.println(goku);
        }
}
