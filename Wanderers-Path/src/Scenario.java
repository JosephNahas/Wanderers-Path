/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
import java.util.Random;
/**
 *
 * @author Joseph
 */
abstract class Scenario {
    protected String scenarioName;
    
    abstract Scenario run(Player player, Game game); // run the scenario until completion, and return the next scenario
    public Scenario nextScenario(Game game){ // return a random scenario from scnearios array, however the last two scenarios are always a healing fountain and then the boss fight 
        if (game.getScenarioNumber() == game.getMaxScenarioNumber() - 1){
            Rest healingFountain = new Rest("Healing Fountain");
            return healingFountain;
        } 
        if (game.getScenarioNumber() == game.getMaxScenarioNumber()){
            return game.getBossFight();
        }
        Random rand = new Random();
        Scenario[] scenarios = game.getScenarios();
        Scenario nextScenario = scenarios[rand.nextInt(scenarios.length)];
        game.removeScenario(nextScenario);
        return nextScenario;
    }
    
    public String getName(){
        return this.scenarioName;
    }
    
    public Scenario checkGameOver(Game game){ // check if the game is over (player dead or boss fight completed), if so return the end game scenario, otherwise return the next scenario and continue game
        if (game.getScenarioNumber() < game.getMaxScenarioNumber() && game.getPlayer().getCurrentHealth() > 0) {
           game.increaseScenarioNumber();
           return nextScenario(game);
        } else {
            EndGame endGame = new EndGame();
            if (game.getPlayer().getCurrentHealth() <= 0){
                Narrator.talk("You died!");
            }
            return endGame;
        }
    }
    
    @Override
    public String toString(){
        return this.scenarioName;
    }
}
