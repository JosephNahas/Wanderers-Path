/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Game {
    private Player player; // the player character
    private Scenario currentScenario; // the current scenario
    private Enemy[] enemies; // array of possible enemies
    private Scenario[] scenarios; // array of possible scenarios
    private boolean gameOver; // game over check
    
    public void initialize(){
        // initialize game settings
        this.currentScenario = new CharacterCreation(this); // game starts at character creation
        this.enemies = new Enemy[5]; // populate possible enemies
        this.scenarios = new Scenario[10]; // populate possible scenarios
        this.gameOver = false;
    }
    
    public void run(){
        // run the game
        while (!this.gameOver){ // if the game is still going, run the current scenario
            this.currentScenario = this.currentScenario.run();
        }
    }
    
    public void setGameOver(boolean bool){
        this.gameOver = bool;
    }
}
