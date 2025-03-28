/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anupa
 */
public class TreasureRoom extends LootRoom {
    public TreasureRoom (Game game, String name) {
        super(game, name);
    }
    
    @Override
    public Scenario run() {
        //welcome narration
        Narrator.talk("You stumbled upon a treasure room filled with riches.");
        Narrator.talk("Check your surroundings for any loot.\n");
        
        //establish loot based on player perception status
        if (currentGame.getPlayer().getPerception() < 5) {
            Narrator.talk("What a keen eye! You found a hidden item!");
            //increase the player's perception status
            currentGame.getPlayer().setPerception(currentGame.getPlayer().getPerception() + 3);
        } else if (currentGame.getPlayer().getPerception() >= 5) {
            Narrator.talk("You didn't find anything.\n");
        }
        
        //continue to next scenario if this isn't the end
        if (this.currentGame.scenarioNumber < 10) {
            this.currentGame.scenarioNumber++;
            return nextScenario();
        } else {
            EndGame endGame = new EndGame(this.currentGame);
            return endGame;
        }
    }
}
