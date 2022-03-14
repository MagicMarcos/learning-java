package play.game.client;

import play.game.FightingGameCharacter;

class FightingGameCharacterClientArgs {
    public static void main(String[] args) {
        System.out.println(args.length + " arguments provided.");
        String name = args[0];
        String specialMove = args[1];
        int overall = Integer.parseInt(args[2]);


        if (args.length < 4) {
            String usage = "Usage: java TelevisionClientArgs <name> <special move name> <overall stats>";
            String example = "Example: java TelevisionClientArgs Pikachu Thunderbolt 195";
            String note = "Note: more arguments are required for creating a full character. \n " +
                    "Namely: Health, AttackPower, Defense, Profession";
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);

        }

        FightingGameCharacter character = new FightingGameCharacter(name , specialMove, overall);
        System.out.println(character);
    }
}