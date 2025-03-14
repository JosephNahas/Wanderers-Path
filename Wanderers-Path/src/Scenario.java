/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
import java.util.Random;
/**
 *
 * @author User
 */
abstract class Scenario {
    protected Game currentGame;
    protected String scenarioName;
    
    abstract Scenario run(); // run the scenario until completion, and return the next scenario
    public Scenario nextScenario(){
        Random rand = new Random();
        Scenario[] scenarios = this.currentGame.getScenarios();
        Scenario nextScenario = scenarios[rand.nextInt(scenarios.length)];
        return nextScenario;
    }
    
    public String getName(){
        return this.scenarioName;
    }
}
