/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;
/**
 *
 * @author User
 */
public class Fight extends Scenario{
    private Enemy enemy;
    
    private Enemy randomEnemy(){
         Random rand = new Random();
         Enemy[] enemies = this.currentGame.getEnemies();
         Enemy randomEnemy = enemies[rand.nextInt(enemies.length)];
         return randomEnemy;
    }
    
    public Fight(Game game){
        this.currentGame = game;
        this.enemy = randomEnemy();
        this.scenarioName = "a Fight with a " + this.enemy.getName();
    }
    
    @Override
    public Scenario run(){
        
        Narrator.talk("You are in " + this.scenarioName + "\nScenario number " + this.currentGame.scenarioNumber + "\nPress Enter to continue");
        Narrator.getInput();
        // Run the fight sequence, turn based
        
        
        
        
        
        
        // after the fight, if the game is still going
        if (this.currentGame.scenarioNumber < 10){
            this.currentGame.scenarioNumber++;
            return nextScenario();
        } else {
            EndGame endGame = new EndGame(this.currentGame);
            return endGame;
        }
        
    }
}
