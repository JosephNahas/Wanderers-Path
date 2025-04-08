/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anupa
 */
import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import java.util.Arrays;

//player must repeat the sequence
public class EchoObstacle extends Scenario{
    private Scanner scanner;
    
    public EchoObstacle(String name) {
        this.scenarioName = name;
        this.scanner = new Scanner(System.in);
    }
    
    @Override
    public Scenario run(Player player, Game game) {
        //randomly choose path
        String[] path = generateRandomPath();
        
        //introduce challenge
        Narrator.lineSeparator();
        Narrator.talk("You entered an enchanted forest when you start to feel disoriented...");
        Narrator.talk("To find your way out you must remember this sequence: " + String.join(", ", path));
        
        //operations
        System.out.println("Enter the sequence, hitting enter after typing one direction at a time:");
        boolean success = true;
        
        //check player's input
        for (String step : path) {
            if (!scanner.nextLine().equalsIgnoreCase(step)) {
                success = false;
                break; //exit if wrong input
            }
        }
        
        if (success) {
            System.out.println("You followed the voice and escaped!");
        } else {
            System.out.println("You took a wrong turn and got lost! Spending too much time in the enchanted forest, you take 10 health damage");
            int damage = 10;
            player.takeDamage(damage);
        }
        
        Narrator.askToCheck(player);
        return super.checkGameOver(game);
    }
    
    //method to randomly generator path
    private String[] generateRandomPath() {
        Random random = new Random();
        
        //randomly choose one of the two direction formats
        String[] directions;
        if (random.nextBoolean()) {
            directions = new String[] {"left", "right"};
        } else {
            directions = new String[] {"east", "west", "north", "south"};
        }
        
        //generate random path
        String[] path = new String[5];
        for (int i = 0; i < path.length; i++) {
            path[i] = directions[random.nextInt(directions.length)];
        }
        
        //shuffle the directions
        Collections.shuffle(Arrays.asList(path));
        
        return path;
    }
}
