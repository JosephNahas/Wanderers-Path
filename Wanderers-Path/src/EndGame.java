/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class EndGame implements Scenario {
    private Game currentGame; // reference to the current game, so we can access stuff from it that we need
    
    @Override
    public Scenario run(){
        // Trigger the end of the game, narrator says the goal of the adventurer was met, princess was saved. yay!
        
        
        
        
        
        
        
        this.currentGame.setGameOver(true); // set game over
        return this; // return any scenario to adhere to the return type to not get an error, game is over anyway
    }
}
