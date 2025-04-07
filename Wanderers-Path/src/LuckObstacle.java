/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anupa
 */
public class LuckObstacle extends Scenario {
    //cursed obstacle which uses luck to determine success
    public LuckObstacle(String name) {
        this.scenarioName = name;
    }
    
    @Override
    public Scenario run(Player player, Game game) {
        Narrator.lineSeparator();
        Narrator.talk("Infront of you lays a cursed tomb. Do you dare to approach?");
        Narrator.enterContinue();
    
        int luckCheck = 15;
        if (player.getLuck() >= luckCheck) {
            Narrator.talk("You approach the cursed tomb and discover a ninja star.");
            NinjaStar ninjaStar = new NinjaStar();
            int luckBonus = 2;
            ninjaStar.applyBonus(player, luckBonus);
            player.collectItem(ninjaStar);
        } else {
            Narrator.talk("You approach the cursed tomb and get cursed! You take 10 damage");
            int damage = 10;
            player.takeDamage(damage);
        }
        
        Narrator.askToCheck(player);
        return super.checkGameOver(game);
    }
}
