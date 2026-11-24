package dungeon;

// Can only use attack(), castSpell(), defend(), and status()

public class Mage implements Character {

    private int lifepoints = 100;

    @Override
    public int attack() {
        System.out.println("Mage is attacking...");
        return 10;
    }

    @Override 
    public int swingGreatSword() {
        System.out.println("Mage can't swing great sword...");
        return 0;
    }

    @Override 
    public int castSpell() {
        System.out.println("Mage casts spell...");
        return 40;
    }

    @Override
    public void heal() {
        System.out.println("Mage can't heal...");
    }

    @Override
    public void defend(int attack) {
        System.out.println("Mage is defending...");
        this.lifepoints -= attack;
    }

    @Override 
    public String status() {
        return (this.lifepoints > 0) ? "alive" : "dead";
    }
}