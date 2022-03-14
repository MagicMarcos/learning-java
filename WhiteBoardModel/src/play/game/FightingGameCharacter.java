package play.game;

/**
 * Business class modeling a generic fighting video game character
 */
public class FightingGameCharacter {
    // statics
    public static final int MIN_HEALTH = 50;
    public static final int MAX_HEALTH = 250;
    public static final int MIN_DEFENSE = 50;
    public static final int MAX_DEFENSE = 250;
    public static final int MIN_ATTACK = 50;
    public static final int MAX_ATTACK = 250;

    // instance variables
    private int health;
    private int attackPower;
    private int defense;
    private String name;
    private String specialMoveName;
    private double overallStats;
    private boolean isUnlocked;
    private Professions profession;

    // constructor
//    public FightingGameCharacter(){
//        // no arg ctor
//    };

    public FightingGameCharacter(String name, String specialMoveName, double overallStats){
        setName(name);
        setSpecialMoveName(specialMoveName);
        setOverallStats(overallStats);
    }

    public FightingGameCharacter(String name, String specialMoveName, double overallStats, int health, int attackPower, int defense){
        this(name, specialMoveName, overallStats);
        setHealth(health);
        setAttackPower(attackPower);
        setDefense(defense);
    }

    FightingGameCharacter(String name, String specialMoveName, double overallStats, int health ,int attackPower, int defense, Professions profession){
        this(name, specialMoveName, overallStats, attackPower, defense, health);
        setProfession(profession);
    }

    // methods
    public void attack(){
        System.out.println(getName() + " attacks dealing " + getAttackPower() + " damage!");
    }
    public void specialMove(){
        System.out.println(getSpecialMoveName() +"!!!");
    }
    public void jump(){
        System.out.println(getName() + " jumps");
    }

    // getters and setters

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health >= MIN_HEALTH && health <= MAX_HEALTH) {
            this.health = health;
        } else {
            System.out.println("Minimal Health must be between: " + MIN_HEALTH + " and " + MAX_HEALTH);
        }

    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        if(defense >= MIN_DEFENSE && defense <= MAX_DEFENSE) {
            this.defense = defense;
        } else {
            System.out.println("Defense must be between: " + MIN_DEFENSE + " and " + MAX_DEFENSE);
        }
    }

    public String getSpecialMoveName() {
        return specialMoveName;
    }

    public void setSpecialMoveName(String specialMoveName) {
        this.specialMoveName = specialMoveName;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        if(attackPower >= MIN_ATTACK && attackPower <= MAX_ATTACK) {
            this.attackPower = attackPower;
        } else {
            System.out.println("attack must be between: " + MIN_ATTACK + " and " + MAX_ATTACK);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOverallStats() {
        return overallStats;
    }

    public void setOverallStats(double overallStats) {
        this.overallStats = overallStats;
    }

    public boolean getIsUnlocked() {
        return isUnlocked;
    }

    public void setUnlocked(boolean unlocked) {
        isUnlocked = unlocked;
    }

    public Professions getProfession(){
        return profession;
    }

    public void setProfession(Professions profession){
        this.profession = profession;
    }

    // string method
    public String toString(){
        return "Character: " + getName() + ", " +
                "Unlocked: " + getIsUnlocked() + ", " +
                "Overall Stats: " + getOverallStats() + ", " +
                "Attack Power: " + getAttackPower() + ", " +
                "Defense: " + getDefense() + ", " +
                "Special Move: " + getSpecialMoveName() + ", " +
                "Health: " + getHealth() + ", " +
                "Profession: " + getProfession();
    }
}