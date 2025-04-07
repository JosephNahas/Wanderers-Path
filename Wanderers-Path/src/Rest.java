/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joseph
 */
public class Rest extends Scenario {
    
    public Rest(String name){
        this.scenarioName = name;
    }
    
    @Override
    public Scenario run(Player player, Game game){
        Narrator.lineSeparator();
        Narrator.talk("You find a healing fountain! You rest and recover any of your missing health");
        player.setCurrentHealth(player.getMaxHealth());
        Narrator.askToCheck(player);
        return super.checkGameOver(game);
    }
}
