/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class LootRoom implements Scenario {
    private Game currentGame; // reference to the current game, so we can access stuff from it that we need
    
    @Override
    public Scenario run(){
        // Run the scenario, a loot room gives the player an opportunity to find an item!
        
        
        
        
        
        
        // after the scenario, if the game is still going
        LootRoom nextScenario = new LootRoom(); // For example player picked a Loot room, could be any other type of room 
        return nextScenario;
    }
}
