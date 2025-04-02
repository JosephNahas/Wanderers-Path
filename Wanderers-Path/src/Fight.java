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
    
    private Enemy randomEnemy(Game game){
         Random rand = new Random();
         Enemy[] enemies = game.getEnemies();
         Enemy randomEnemy = enemies[rand.nextInt(enemies.length)];
         game.removeEnemy(randomEnemy);
         return randomEnemy;
    }
    
    public Fight(Game game){
        this.enemy = randomEnemy(game);
        this.scenarioName = "a Fight with a " + this.enemy.getName();
    }
    
    @Override
    public Scenario run(Player player, Game game){
       Narrator.lineSeparator();
       Narrator.talk("You are in " + this.scenarioName);
       // Run the fight sequence, turn based
        
        
        
        
        
       Narrator.enterContinue();
       return super.checkGameOver(game);
        
    }
}
