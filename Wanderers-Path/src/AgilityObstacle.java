/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anupa
 */
public class AgilityObstacle extends Scenario {
    //rain by a ravine using agility to determine success
    public AgilityObstacle(String name) {
        this.scenarioName = name;
    }
    
    @Override
    public Scenario run(Player player, Game game) {
        Narrator.talk("You come across a ravine with a... ");
        
        if (player.getAgility() >= 10) {
            Narrator.talk("You manage to keep your balance and cross the ravine!");
        } else if (player.getAgility() <= 9){
            Narrator.talk("");
        }
    }
}
