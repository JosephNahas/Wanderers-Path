/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author User
 */
public class CharacterCreation extends Scenario {
    private Player myPlayer; // reference to the player character
    
    public CharacterCreation(Game game){
        this.currentGame = game;
        this.scenarioName = "Character Creation";
    }
    
    @Override
    public Scenario run(){
        
        Narrator.talk("You are in " + this.scenarioName + "\nPress Enter to continue");
        String input = Narrator.getInput();
        
        // Set character's name and stats 
        
        
        
        
        
        
        //Pick next Scenario
        
        
        
        
        
        
        
        //
        this.currentGame.scenarioNumber++;
        System.out.println("Leaving Character Creation");
        return nextScenario();
    }
}
