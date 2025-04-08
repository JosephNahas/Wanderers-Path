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
        Narrator.lineSeparator();
        Narrator.talk("While walking along a ravine it starts to rain making it muddy and the earth slide beneath your feet.");
        Narrator.talk("Are you able to keep your balance while walking along the ravine?");
        Narrator.enterContinue();
        int aglCheck = 15;
        if (player.getAgility() >= aglCheck) {
            Narrator.talk("You manage to keep your balance and cross the ravine!");
        } else {
            int damage = 10;
            Narrator.talk("You slip and fall into the ravine pushing you down stream with the heavy rain. You take " + damage + " health damage");
            player.takeDamage(damage);
        }
        
        Narrator.askToCheck(player);
        return super.checkGameOver(game);
    }
}
