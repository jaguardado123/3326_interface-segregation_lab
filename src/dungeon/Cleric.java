package dungeon;

// Can only use attack(), heal(), defend(), and status()

public class Cleric implements Character {

    private int lifepoints = 100;

    @Override
    public int attack() {
        System.out.println("Cleric is attacking...");
        return 10;
    }

    @Override 
    public int swingGreatSword() {
        System.out.println("Cleric can't swing great sword...");
        return 0;
    }

    @Override 
    public int castSpell() {
        System.out.println("Cleric can't cast spells...");
        return 0;
    }

    @Override
    public void heal() {
        System.out.println("Cleric is healing...");
        this.lifepoints += 25;
    }

    @Override
    public void defend(int attack) {
        System.out.println("Cleric is defending...");
        this.lifepoints -= attack;
    }

    @Override 
    public String status() {
        return (this.lifepoints > 0) ? "alive" : "dead";
    }
}