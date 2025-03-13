/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class CharacterCreation implements Scenario {
    private Game currentGame; // reference to the current game, so we can access stuff from it that we need
    private Player myPlayer; // reference to the player character
    
    public CharacterCreation(Game game){
        this.currentGame = game;
    }
    
    @Override
    public Scenario run(){
        // Set character's name and stats 
        
        
        
        
        
        
        //Pick next Scenario
        
        
        
        
        
        
        
        //
        this.currentGame.setGameOver(true); // TEMPORARY TO AVOID AN INFINITE LOOP
        LootRoom nextScenario = new LootRoom(); // For example player picked a Loot room, could be any other type of room 
        return nextScenario;
    }
}
