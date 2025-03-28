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
        Giant giant = new Giant();
        IceDragon dragon = new IceDragon();
        Monkey monkey = new Monkey();
        Scorpion scorpion = new Scorpion();
        Zombie zombie = new Zombie();
        this.enemies = new Enemy[]{giant, dragon, monkey, scorpion, zombie};
    }
    
    private void populateScenarios(){
        Scenario treasureRoom = new TreasureRoom(this, "Treasure Room");
        Scenario wreckageRoom = new Wreckage(this, "Wreckage Room");
        Scenario luckRoom = new LuckRoom(this, "Test Your Luck");
        Scenario obstacleRoom1 = new Obstacle(this, "Obstacle1");
        Scenario obstacleRoom2 = new Obstacle(this, "Obstacle2");
        Scenario fight1 = new Fight(this);
        Scenario fight2 = new Fight(this);
        Scenario fight3 = new Fight(this);
        Scenario rest1 = new Rest(this, "Rest1");
        Scenario rest2 = new Rest(this, "Rest2");
        this.scenarios = new Scenario[] {
            treasureRoom, wreckageRoom, luckRoom , obstacleRoom1, obstacleRoom2, 
            fight1, fight2, fight3, rest1, rest2
        };
    }
    
    public void initialize(){
        // initialize game settings
        this.player = new Player();
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
