/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anupa
 */
import java.util.Random;

public class LuckRoom extends LootRoom {
    public LuckRoom(Game game, String name) {
        super(game, name);
    }
    
    @Override
    public Scenario run() {
        Narrator.talk("You enter a room full of riches... Maybe this is your lucky break!\n");
        Narrator.talk("You find a note that reads, 'Test your luck! Guess the correct number between 1 and 25, and earn a reward!'\n");
        Narrator.talk("Maybe your perception will help!\n");
        
        //generate a random number between 1 and 25
        Random random = new Random();
        int correctNum = random.nextInt(25) + 1;
        
        //get player's luck and perception stats
        int perception = currentGame.getPlayer().getPerception();
        int luck = currentGame.getPlayer().getLuck();
        int guess = -1;
        
        //higher the luck/perception, the less tries it takes
        
        
        //begin guessing game
        while (guess != correctNum) {
            Narrator.talk("Make a guess: ");
            guess = Integer.parseInt(Narrator.getInput());
            
            if (guess < correctNum) {
                Narrator.talk("Your guess is too low. Try again.\n");
            } else if (guess > correctNum) {
                Narrator.talk("Your guess is too high. Try again.\n");
            } else {
                Narrator.talk("Congratulations! That's correct.\n");
                //reward the player
                rewardPlayer(correctNum);
                break;
            }
        }
        
        //proceed to next scenario or end game if the end
        if (this.currentGame.scenarioNumber < 10) {
            this.currentGame.scenarioNumber++;
            return nextScenario();
        } else {
            EndGame endGame = new EndGame(this.currentGame);
            return endGame;
        }
    }
    
    //reward the player based on the number guessed
    private void rewardPlayer(int numGuessed) {        
        //reward based on number range
        if (numGuessed >= 1 && numGuessed <= 5) {
            //increase constitution
            Narrator.talk("You found a healing serum!");
            currentGame.getPlayer().increaseConst(4);  
        } else if (numGuessed >= 6 && numGuessed <= 10) {
            //increase strength
            Narrator.talk("You found a strength elixir!");
            currentGame.getPlayer().increaseStrength(5);
        } else if (numGuessed >= 11 && numGuessed <= 15) {
            //increase agility
            Narrator.talk("You found an agility cloak!");
            currentGame.getPlayer().increaseAgility(3);
        } else if (numGuessed >= 16 && numGuessed <= 20) {
            //increase perception
            currentGame.getPlayer().increasePercep(2);
        } else if (numGuessed >=21 && numGuessed <= 25) {
            //increase luck
            Narrator.talk("A horseshoe! What a lucky find!");
            currentGame.getPlayer().increaseLuck(3);
        }
    }
}
