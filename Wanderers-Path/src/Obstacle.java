/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Obstacle implements Scenario {
    private Game currentGame; // reference to the current game, so we can access stuff from it that we need
    
    @Override
    public Scenario run(){
        // Run the obstacle, an obstacle room example is the player is faced with a trap and must pass a luck check to avoid taking damage, or can pass a perception check to see the trap and avoid it that way
        
        
        
        
        
        
        // after the scenario, if the game is still going
        LootRoom nextScenario = new LootRoom(); // For example player picked a Loot room, could be any other type of room 
        return nextScenario;
    }
}
