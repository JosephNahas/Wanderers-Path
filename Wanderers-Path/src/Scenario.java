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
    public Scenario nextScenario(Game game){
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
    
    public Scenario checkGameOver(Game game){
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
}
