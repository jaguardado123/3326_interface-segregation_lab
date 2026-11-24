package dungeon;

// Has all the methods all game characters may (or may not) use.

public interface Character {

    int attack();

    int swingGreatSword();

    int castSpell();

    void heal();

    void defend(int attack);

    String status();
}