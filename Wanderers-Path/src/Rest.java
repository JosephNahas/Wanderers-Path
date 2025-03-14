/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Rest extends Scenario {
    
    public Rest(Game game, String name){
        this.currentGame = game;
        this.scenarioName = name;
    }
    
    @Override
    public Scenario run(){
        Narrator.talk("You are in " + this.scenarioName + "\nScenario Number " + this.currentGame.scenarioNumber + "\nPress Enter to continue");
        Narrator.getInput();
        // Run the resting scenario, a rest room allows the player to restore health
        
        
        
        
        
        
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
