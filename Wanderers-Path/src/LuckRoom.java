/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anupa
 */
import java.util.Random;

public class LuckRoom extends Scenario {
    
    public LuckRoom(String name){
        this.scenarioName = name;
    }
    
    @Override
    public Scenario run(Player player, Game game) {
        Narrator.lineSeparator();
        int guessRangeMin = 1;
        int guessRangeMax = 20;
        Narrator.talk("You enter a room full of riches... Maybe this is your lucky break!");
        Narrator.talk("You find a note that reads, 'Test your luck! Guess the correct number between " + guessRangeMin + " and " + guessRangeMax + ", and earn a reward!'");
        Narrator.talk("Do you dare to test your faith?");
        
        //generate a random number between 1 and 20
        Random random = new Random();
        int correctNum = random.nextInt(guessRangeMax) + 1;
        
        //get player's luck and perception stats
        int perception = player.getPerception();
        int luck = player.getLuck();
        int perceptionCheck = 15;
        int luckCheck = 15;
        int statCheckPass = 6;
        int statCheckFail = 3;
        
        //set number of attempts based on luck/perception stat
        int maxAttempts = (perception >= perceptionCheck || luck >= luckCheck) ? statCheckPass : statCheckFail;
        int attempts = 0;
        //intialize guess to less than 1-10
        int guess = -1;
        
        //begin guessing game
        while (attempts < maxAttempts) {
            Narrator.talk("Attempt " + (attempts + 1) + "/" + maxAttempts + "\n" + "Make a guess: ");
            
            //check user input
            try {
                guess = Integer.parseInt(Narrator.getInput());
            } catch (NumberFormatException e) {
                Narrator.talk("Invalid input! Enter a number between " + guessRangeMin + " and " + guessRangeMax);
                continue;
            }
            
            attempts++;
            
            //out of range guess
            if (guess < guessRangeMin || guess > guessRangeMax) {
                Narrator.talk("Your guess is out of range! Pick a number between " + guessRangeMin + " and " + guessRangeMax);
                continue;
            }
            
            //guess hints
            if (guess < correctNum) {
                Narrator.talk("Your guess is too low. Try again.\n");
            } else if (guess > correctNum) {
                Narrator.talk("Your guess is too high. Try again.\n");
            } else if (guess == correctNum) {
                Narrator.talk("Congratulations! That's correct.\n");
                //reward the player
                rewardPlayer(player, attempts);
                break;
            }
        }
        
        //if player runs out of attempts
        if (guess != correctNum) {
            Narrator.talk("You ran out of attempts! Better luck next time.");
            Narrator.talk("The correct number was " + correctNum + ".\n");
        }
        
        Narrator.askToCheck(player);
        return super.checkGameOver(game);
    }
    
    //reward the player based on the number guessed
    private void rewardPlayer(Player player, int attempts) {        
        //reward based on number range
        switch (attempts) {
            case 1: 
                //collect Chestguard
                Narrator.talk("You earned a Chest Guard!");
                ChestGuard chestGuard = new ChestGuard();
                int constitutionBonus = 2;
                chestGuard.applyBonus(player, constitutionBonus);
                player.collectItem(chestGuard);
                Narrator.talk("Your Constitution has increased by " + constitutionBonus + ".\n");
                break;
            
            case 2:
                //collect iron bracers
                Narrator.talk("You earned a pair of Iron Bracers!");
                IronBracers ironBracers = new IronBracers();
                int strengthBonus = 2;
                ironBracers.applyBonus(player, strengthBonus);
                player.collectItem(ironBracers);
                Narrator.talk("Your strength has increased by " + strengthBonus + ".\n");
                break;
            
            case 3:
                //collect agility cloak
                Narrator.talk("You earned an agility cloak!");
                AgilityCloak aglCloak = new AgilityCloak();
                int agilityBonus = 2;
                aglCloak.applyBonus(player, agilityBonus);
                player.collectItem(aglCloak);
                Narrator.talk("Your agility has increased by " + agilityBonus + ".\n");
                break;
            
            case 4:
                //collect crown
                Narrator.talk("You earned a beautiful crown!");
                Crown crown = new Crown();
                int perceptionBonus = 2;
                crown.applyBonus(player, perceptionBonus);
                player.collectItem(crown);
                Narrator.talk("Your perception has increased by " + perceptionBonus + ".\n");
                break;
            
            case 5:
                //collect horseshoe
                Narrator.talk("You earned a horseshoe!");
                Horseshoe horseshoe = new Horseshoe();
                int luckBonus = 2;
                horseshoe.applyBonus(player, luckBonus);
                player.collectItem(horseshoe);
                Narrator.talk("Your luck increased by " + luckBonus + ".\n");
                break;                
        }
    }
}
