/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anupa
 */

public class IntellectualObstacle extends Scenario {
    //the user must select an items to pass this obstacle (this obstacle can use items from their collection later on)
    public IntellectualObstacle(String name) {
        this.scenarioName = name;
    }
    
    @Override
    public Scenario run(Player player, Game game) {
        Narrator.lineSeparator();
        Narrator.talk("You come across a cave with a thick stone door.");
        Narrator.talk("To pass you must select an item to help pass the door.");
       
        //options
        System.out.println("1. Use strength");
        System.out.println("2. Sledgehammer");
        System.out.println("3. TNT");
        System.out.println("4. Invisibility Potion");
        
        
        String choice = Narrator.getInput();
        int strengthCheck = 14;
        int perceptionCheck = 14;
        
        switch (choice) {
            case "1":
                //use strength
                if (player.getStrength() > strengthCheck) {
                    Narrator.talk("You use your strength to push the stone door open!");
                } else {
                    int strengthPenalty = 1;
                    Narrator.talk("You use your strength to try and push the stone door open but it was too heavy. You lose " + strengthPenalty + " point in strength");
                    player.decreaseStrength(strengthPenalty);
                }
                break;
            
            case "2":
                //use sledgehammer
                Narrator.talk("You take a swing at the door with the sledgehammer...");
                if (player.getStrength() > strengthCheck) {
                    Narrator.talk("1... 2... 3... With a mighty swing, the stone door cracks open!");
                } else {
                    int strengthPenalty = 1;
                    Narrator.talk("1... 2... 3... 4... 5... You mustered all your strength but still couldn't crack the stone door open. You lose " + strengthPenalty + " point in strength");
                    player.decreaseStrength(strengthPenalty);
                }
                break;
            
            case "3":
                //use TNT
                Narrator.talk("You place the TNT by the stone door...");
                if (player.getPerception() > perceptionCheck) {
                    Narrator.talk("You light it and run to hide behind a stone as the explosive clears the doorway for you to pass.");
                } else {
                    int damage = 10;
                    Narrator.talk("You light the TNT but it backfires causing " + damage + " damage to you.");
                    player.takeDamage(damage);
                }
                break;
            
            case "4":
                //use invisibility potion
                Narrator.talk("You drink the invisibility potion allowing you to pass through the door.");
                break;
            
            default:
                System.out.println("Invalid option. Try again.");
                return run(player, game);  
        }
        
        Narrator.askToCheck(player);
        return super.checkGameOver(game);
    }    
}
