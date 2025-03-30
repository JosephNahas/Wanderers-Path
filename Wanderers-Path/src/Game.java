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
    private int scenarioNumber = 0;
    
    private void populateEnemies(){
        Giant giant = new Giant();
        IceDragon dragon = new IceDragon();
        Monkey monkey = new Monkey();
        Scorpion scorpion = new Scorpion();
        Zombie zombie = new Zombie();
        this.enemies = new Enemy[]{giant, dragon, monkey, scorpion, zombie};
    }
    
    private void populateScenarios(){
        Scenario treasureRoom = new TreasureRoom("Treasure Room");
        Scenario wreckageRoom = new Wreckage("Wreckage Room");
        Scenario luckRoom = new LuckRoom("Test Your Luck");
        Scenario obstacleRoom1 = new Obstacle("Obstacle1");
        Scenario obstacleRoom2 = new Obstacle("Obstacle2");
        Scenario fight1 = new Fight(this);
        Scenario fight2 = new Fight(this);
        Scenario fight3 = new Fight(this);
        Scenario rest1 = new Rest("Rest1");
        Scenario rest2 = new Rest("Rest2");
        this.scenarios = new Scenario[] {
            treasureRoom, wreckageRoom, luckRoom , obstacleRoom1, obstacleRoom2, 
            fight1, fight2, fight3, rest1, rest2
        };
    }
    
    public void initialize(){
        // initialize game settings
        this.player = new Player();
        this.currentScenario = new CharacterCreation(player); // game starts at character creation
        populateEnemies();
        populateScenarios();
        this.gameOver = false;
    }
    
    public void run(){
        // run the game
        while (!this.gameOver){ // if the game is still going, run the current scenario
            this.currentScenario = this.currentScenario.run(player, this);
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
    
    public int getScenarioNumber(){
        return this.scenarioNumber;
    }
    
    public void increaseScenarioNumber(){
        this.scenarioNumber++;
    }
    
    public void removeEnemy(Enemy enemy){
        Enemy[] updatedEnemies = new Enemy[this.enemies.length - 1];
        int j = 0;
        for (int i = 0; i < this.enemies.length; i++){
            if (!this.enemies[i].getName().equals(enemy.getName())){
                updatedEnemies[j] = this.enemies[i];
                j++;
            }
        }
        this.enemies = updatedEnemies;
    }
    
     public void removeScenario(Scenario scenario){
        Scenario[] updatedScenarios = new Scenario[this.scenarios.length - 1];
        int j = 0;
        for (int i = 0; i < this.scenarios.length; i++){
            if (!this.scenarios[i].getName().equals(scenario.getName())){
                updatedScenarios[j] = this.scenarios[i];
                j++;
            }
        }
        this.scenarios = updatedScenarios;
    }
}
