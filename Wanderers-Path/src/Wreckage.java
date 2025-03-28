/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anupa
 */
public class Wreckage extends LootRoom {
    public Wreckage(Game game, String name) {
        super(game, name);
    }
    
    @Override
    public Scenario run() {
        Narrator.talk("You found a wreckage from a past battle.\n");
        Narrator.talk("There is a fallen log blocking the exit.\n");
        Narrator.talk("Upon further inspection you notice something shining from underneath the log.\n");
        Narrator.talk("Can you retrieve the item? Put your strength to the test!\n");
        
        //establish success based on player strength stat
        int strength = currentGame.getPlayer().getStrength();
        
        if (strength >= 8) {
            Narrator.talk("You successfully lifted the log!");
        } else if (strength <= 4) {
            Narrator.talk("You mustered all your strength but it's too heavy for you.\n");
            //decrease the player's strength by 2
            currentGame.getPlayer().decreaseStrength(2);
        } else if (strength >= 5 && strength <= 7){
            Narrator.talk("Despite your strength you were unable to remove the log.\n");
            //decrease the player's strength by 1
            currentGame.getPlayer().decreaseStrength(1);
        }
        
        //proceed to next scenario or end game if the end
        if (this.currentGame.scenarioNumber < 10) {
            this.currentGame.scenarioNumber++;
            return nextScenario();
        } else {
            EndGame endGame = new EndGame(this.currentGame);
            return endGame;
        }
    }
}
