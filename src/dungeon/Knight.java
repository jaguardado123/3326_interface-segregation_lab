package dungeon;

// Can only use attack(), swingGreatSword(), defend(), and status()

public class Knight implements Character {

    private int lifepoints = 150;

    @Override
    public int attack() {
        System.out.println("Knight is attacking...");
        return 15;
    }

    @Override 
    public int swingGreatSword() {
        System.out.println("Knight swings great sword...");
        return 35;
    }

    @Override 
    public int castSpell() {
        System.out.println("Knight can't cast spells...");
        return 0;
    }

    @Override
    public void heal() {
        System.out.println("Knight can't heal...");
    }

    @Override
    public void defend(int attack) {
        System.out.println("Knight is defending...");
        this.lifepoints -= attack;
    }

    @Override 
    public String status() {
        return (this.lifepoints > 0) ? "alive" : "dead";
    }
}