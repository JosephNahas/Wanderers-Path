/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Rest extends Scenario {
    
    public Rest(String name){
        this.scenarioName = name;
    }
    
    @Override
    public Scenario run(Player player, Game game){
        Narrator.lineSeparator();
        Narrator.talk("You find a healing fountain! You rest and recover any of your missing health");
        Narrator.enterContinue();
        return super.checkGameOver(game);
    }
}
