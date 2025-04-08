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
             int luckBonus = 2;
            Narrator.talk("You approach the cursed tomb and discover a ninja star. Your luck increases by " + luckBonus);
            NinjaStar ninjaStar = new NinjaStar();
            ninjaStar.applyBonus(player, luckBonus);
            player.collectItem(ninjaStar);
        } else {
            int damage = 10;
            Narrator.talk("You approach the cursed tomb and get cursed! You take " + damage + " damage");
            player.takeDamage(damage);
        }
        
        Narrator.askToCheck(player);
        return super.checkGameOver(game);
    }
}
