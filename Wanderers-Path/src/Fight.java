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
    
    private void FightSequence(Player player){
        if (player.getStatusEffect() != null){
            player.setStatusEffect(null);
        }
        while(player.getCurrentHealth() > 0 && this.enemy.getCurrentHealth() > 0){
            playerTurn(player);
            if (this.enemy.getCurrentHealth() > 0){
                enemyTurn(player);
            }
        }
    }
    
    private void playerTurn(Player player){
        Narrator.lineSeparator();
        Narrator.talk("Your turn!");
        if (player.getStatusEffect() != null){
            player.getStatusEffect().applyEffect(player);
        }
        if (player.getCurrentHealth() > 0 && player.canAttack){
            Narrator.talk("Press Enter to attack!");
            Narrator.getInput();
            int damage = player.getWeapon().calculateDamage(player);
            if (damage >= this.enemy.getArmorClass()){
                Narrator.talk("You hit " + this.enemy.getName() + " for " + damage + " damage!");
                this.enemy.takeDamage(damage);
                if (this.enemy.getCurrentHealth() > 0){
                    Narrator.talk(this.enemy.getName() + " remaining health: " + this.enemy.getCurrentHealth());
                } else {
                    Narrator.talk(this.enemy.getName() + " is dead!");
                }
                Narrator.enterContinue();
            } else {
                Narrator.talk("Your attack misses!");
            }
        }
    }
    
    private void enemyTurn(Player player){
        Narrator.lineSeparator();
        if (player.getStatusEffect() != null){
            if (player.getStatusEffect().isExpired()){
                player.getStatusEffect().resolveEffect(player);
                player.setStatusEffect(null);
                Narrator.enterContinue();
            }
        }
        Narrator.talk("Enemy turn!");
        this.enemy.attack(player);
        if (player.getCurrentHealth() > 0){
            Narrator.talk("Your remaining health: " + player.getCurrentHealth());
        }
        Narrator.enterContinue();
    }
    
    @Override
    public Scenario run(Player player, Game game){
       Narrator.lineSeparator();
       Narrator.talk("You are in " + this.scenarioName);
       Narrator.talk("Press Enter to start fight!");
       Narrator.getInput();
       // Run the fight sequence, turn based
       FightSequence(player);
       if (game.getScenarioNumber() < game.getMaxScenarioNumber()){
           Narrator.askToCheck(player);
       }
       return super.checkGameOver(game);
    }
}
