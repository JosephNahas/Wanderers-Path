/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anupa
 */
public class TreasureRoom extends Scenario {
    public TreasureRoom (String name) {
        this.scenarioName = name;
    }
    
    @Override
    public Scenario run(Player player, Game game) {
        //welcome narration
        Narrator.lineSeparator();
        Narrator.talk("You stumbled upon a treasure room filled with riches.");
        Narrator.talk("Press Enter to check your surroundings for any loot.\n");
        Narrator.getInput();
        
        //establish loot based on player perception status
        if (player.getPerception() >= 17) {
            Narrator.talk("What a keen eye! You found a hunter's cap!");
            //collect Hunter's cap
            HunterCap hunterCap = new HunterCap();
            int perceptionBonus = 1;
            hunterCap.applyBonus(player, perceptionBonus);
            player.collectItem(hunterCap);
            Narrator.talk("Your perception has increased by 1.\n");
        } else if (player.getPerception() < 17) {
            Narrator.talk("You didn't find anything.\n");
        }
        
        //continue to next scenario if this isn't the end
        Narrator.askToCheck(player);
        return super.checkGameOver(game);
    }
}
