/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;
/**
 *
 * @author Joseph
 */
public class Fight extends Scenario{
    private Enemy enemy;
    
    private Enemy randomEnemy(Game game, boolean boss){
        Random rand = new Random();
        if (!boss){
           Enemy[] enemies = game.getEnemies();
           Enemy randomEnemy = enemies[rand.nextInt(enemies.length)];
           game.removeEnemy(randomEnemy);
           return randomEnemy;
        } else {
           Enemy[] bosses = game.getBosses();
           Enemy randomBoss = bosses[rand.nextInt(bosses.length)];
           return randomBoss;
        }
    }
    
    public Fight(Game game, boolean boss){
        this.enemy = randomEnemy(game, boss);
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
