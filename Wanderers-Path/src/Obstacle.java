/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Obstacle extends Scenario {
    
    public Obstacle(String name){
        this.scenarioName = name;
    }
    
    @Override
    public Scenario run(Player player, Game game){
        Narrator.lineSeparator();
        Narrator.talk("You are in " + this.scenarioName);
        // Run the obstacle, an obstacle room example is the player is faced with a trap and must pass a luck check to avoid taking damage, or can pass a perception check to see the trap and avoid it that way
        
        
        
        
        
        Narrator.enterContinue();
        return super.checkGameOver(game);
    }
}
