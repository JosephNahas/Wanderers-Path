/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class LootRoom extends Scenario {
    
    public LootRoom(Game game, String name){
        this.currentGame = game;
        this.scenarioName = name;
    }
    
    @Override
    public Scenario run(){
        Narrator.talk("You are in " + this.scenarioName + "\nScenario number " + this.currentGame.scenarioNumber + "\nPress Enter to continue");
        Narrator.getInput();
        // Run the scenario, a loot room gives the player an opportunity to find an item!
        
        
        
        
        
        
        // after the scenario, if the game is still going
        if (this.currentGame.scenarioNumber < 10){
            this.currentGame.scenarioNumber++;
            return nextScenario();
        } else {
            EndGame endGame = new EndGame(this.currentGame);
            return endGame;
        }
    }
}
