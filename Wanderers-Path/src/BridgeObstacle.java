/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anupa
 */
import java.util.Scanner;

public class BridgeObstacle extends Scenario {
    private Scanner scanner;
    
    public BridgeObstacle(String name){
        this.scenarioName = name;
        this.scanner = new Scanner(System.in);
    }
    
    @Override
    public Scenario run(Player player, Game game) {
        Narrator.lineSeparator();
        Narrator.talk("As you journey your way to survival, you encounter a bridge. This bridge looks rather old and unsturdy.");
        Narrator.talk("You begin crossing when you hear a crack... THE PLANKS ARE BREAKING!");
        Narrator.talk("Type 'RUN' quickly to save yourself!\n");
        
        long startTime = System.currentTimeMillis();
        String input = scanner.nextLine();
        long endTime = System.currentTimeMillis();
        
        //operations
        if (input.equalsIgnoreCase("RUN") && (endTime - startTime) < 8000) {
            System.out.println("You made it just in time!");
        } else {
            int damage = 10;
            System.out.println("You were too slow! You fall and take " + damage + " health damage");
            player.takeDamage(damage);
        }
        
        Narrator.askToCheck(player);
        return super.checkGameOver(game);
    }
}
