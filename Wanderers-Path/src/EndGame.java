/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class EndGame extends Scenario {
   
    @Override
    public Scenario run(Player player, Game game){
        // Trigger the end of the game, narrator says the goal of the adventurer was met, princess was saved. yay!
        Narrator.talk("Game Over! Exiting now...");
        
        
        
        
        
        
        game.setGameOver(true); // set game over
        return this; // return any scenario to adhere to the return type to not get an error, game is over anyway
    }
}
