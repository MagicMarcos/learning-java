package play.game.test;

import play.game.FightingGameCharacter;

class FightingGameCharacterValidationTest {
    public static void main(String[] args) {
        FightingGameCharacter fgc1 = new FightingGameCharacter("Bagheera" , "BORK!" , 1000 , 200 , 150, 150);
        System.out.println(fgc1);

        fgc1.setDefense(1500);
        fgc1.setAttackPower(1500);
        fgc1.setHealth(1500);

        System.out.println(fgc1);
    }
}