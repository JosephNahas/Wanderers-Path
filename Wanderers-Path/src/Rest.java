/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Rest extends Scenario {
    
    public Rest(String name){
        this.scenarioName = name;
    }
    
    @Override
    public Scenario run(Player player, Game game){
        Narrator.lineSeparator();
        Narrator.talk("You are in " + this.scenarioName);
  
        // Run the resting scenario, a rest room allows the player to restore health
        
        
        
        
        
        Narrator.enterContinue();
        return super.checkGameOver(game);
    }
}
