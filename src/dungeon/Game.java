package dungeon;
import java.util.*;

public class Game {

    private Map<String, Character> player;

    public Game() {
        this.player = new HashMap<>();
        this.player.put("a", new Knight());
        this.player.put("b", new Cleric());
        this.player.put("c", new Mage());
    }

    public void startGame() {
        System.out.println("Welcome to Dungeons & Dragons Game!");
        System.out.println("Choose your character:");
        System.out.println("a. Knight, b. Cleric, c. Mage");
        Scanner input = new Scanner(System.in);
        System.out.print("Your choice: ");
        String choice = input.next();

        System.out.println("You are fighting an evil knight...");
        Character evilKnight = new Knight();

        while( this.player.get(choice).status().equals("alive") && evilKnight.status().equals("alive")) {
            // You defend
            this.player.get(choice).defend( evilKnight.attack() );
            // You attack
            evilKnight.defend( this.player.get(choice).attack() );
            // You use your ability
            switch(choice) {
                case "a": 
                    evilKnight.defend( this.player.get(choice).swingGreatSword() );
                    break;
                case "b": 
                    this.player.get(choice).heal();
                    break;
                case "c": 
                    evilKnight.defend( this.player.get(choice).castSpell() );
                    break;
            }
        }

        if (this.player.get(choice).status().equals("alive")) {
            System.out.println("You won!");
        }
        else {
            System.out.println("You lost!");
        }



    }
}