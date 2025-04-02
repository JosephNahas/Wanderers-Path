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
        Narrator.talk("Infront of you lays a cursed tomb. Do you are to approach?");
    
        if (player.getLuck() >= 15) {
            Narrator.talk("You choose to not risk your life.");
            //decrease perception
        } else if (player.getLuck() <= 10) {
            Narrator.talk("You approach the cursed tomb and find three(3) ninja stars.");
            //increase luck and add new items
        }
    }
}
