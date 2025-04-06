/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joseph
 */
public class EndGame extends Scenario {
   
    @Override
    public Scenario run(Player player, Game game){
        // Trigger the end of the game
        Narrator.talk("Game Over! Exiting now...");
        game.setGameOver(true); // set game over
        return this;
    }
}
