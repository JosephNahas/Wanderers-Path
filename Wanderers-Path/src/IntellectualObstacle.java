/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anupa
 */
public class IntellectualObstacle extends Scenario {
    //the user must use one of their items to pass this obstacle. It's a "weight" obstacle
    public IntellectualObstacle(String name) {
        this.scenarioName = name;
    }
    
    @Override
    public Scenario run(Player player, Game game) {
        Narrator.talk("You come across a cave with a thick stone door.");
        Narrator.talk("To pass you must use one of your items to open the door. The heavier the item, the higher your chance.");
        
    }    
}
