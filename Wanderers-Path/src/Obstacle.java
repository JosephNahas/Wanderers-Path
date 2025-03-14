/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Obstacle extends Scenario {
    
    public Obstacle(Game game, String name){
        this.currentGame = game;
        this.scenarioName = name;
    }
    
    @Override
    public Scenario run(){
        Narrator.talk("You are in " + this.scenarioName + "\nScenario number " + this.currentGame.scenarioNumber + "\nPress Enter to continue");
        Narrator.getInput();
        // Run the obstacle, an obstacle room example is the player is faced with a trap and must pass a luck check to avoid taking damage, or can pass a perception check to see the trap and avoid it that way
        
        
        
        
        
        
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
