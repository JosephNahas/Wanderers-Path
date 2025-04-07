/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anupa
 */
public class Wreckage extends Scenario {
    public Wreckage(String name) {
        this.scenarioName = name;
    }
    
    @Override
    public Scenario run(Player player, Game game) {
        Narrator.lineSeparator();
        Narrator.talk("You found a wreckage from a past battle. There is a fallen log by the exit.");
        Narrator.talk("Upon further inspection you notice something shining from underneath the log.");
        Narrator.talk("Can you retrieve the item? Put your strength to the test!\n");
        Narrator.talk("Press Enter to try and lift the log...");
        Narrator.getInput();
        
        //establish success based on player strength stat
        int strength = player.getStrength();
        int strengthCheck = 15;
        
        if (strength >= strengthCheck) {
            Narrator.talk("You successfully lifted the log to find a ruby ring!\n");
            // Collect Ruby ring
            RubyRing rubyRing = new RubyRing();
            int constitutionBonus = 1;
            rubyRing.applyBonus(player, constitutionBonus);
            player.collectItem(rubyRing);
            Narrator.talk("Your Constitution has increased by 1.\n");
        } else {
            Narrator.talk("You try your best, but the log is simply too heavy!");
        }
        
        //proceed to next scenario or end game if the end
        Narrator.askToCheck(player);
        return super.checkGameOver(game);
    }
}
