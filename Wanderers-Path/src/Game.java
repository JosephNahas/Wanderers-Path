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
    public int scenarioNumber = 0;
    
    private void populateEnemies(){
        
        this.enemies = new Enemy[]{};
    }
    
    private void populateScenarios(){
        Scenario lootRoom1 = new LootRoom(this, "lootRoom1");
        Scenario lootRoom2 = new LootRoom(this, "lootRoom2");
        Scenario lootRoom3 = new LootRoom(this, "lootRoom3");
        Scenario obstacleRoom1 = new Obstacle(this, "Obstacle1");
        Scenario obstacleRoom2 = new Obstacle(this, "Obstacle2");
        Scenario fight1 = new Fight(this);
        Scenario fight2 = new Fight(this);
        Scenario fight3 = new Fight(this);
        Scenario rest1 = new Rest(this, "Rest1");
        Scenario rest2 = new Rest(this, "Rest2");
        this.scenarios = new Scenario[]{lootRoom1, lootRoom2, lootRoom3, obstacleRoom1, obstacleRoom2, fight1, fight2, fight3, rest1, rest2};
    }
    
    public void initialize(){
        // initialize game settings
        this.currentScenario = new CharacterCreation(this); // game starts at character creation
        populateEnemies();
        populateScenarios();
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
    
    public Enemy[] getEnemies(){
        return this.enemies;
    }
    
    public Scenario[] getScenarios(){
        return this.scenarios;
    }
    
    public Player getPlayer(){
        return this.player;
    }
}
