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
        Narrator.talk("You enter a room full of riches... Maybe this is your lucky break!");
        Narrator.talk("You find a note that reads, 'Test your luck! Guess the correct number between 1 and 25, and earn a reward!'");
        Narrator.talk("Do you dare to test your faith?");
        
        //generate a random number between 1 and 10
        Random random = new Random();
        int correctNum = random.nextInt(10) + 1;
        
        //get player's luck and perception stats
        int perception = currentGame.getPlayer().getPerception();
        int luck = currentGame.getPlayer().getLuck();
        
        //set number of attempts based on luck/perception stat
        int maxAttempts = (perception >= 5 || luck >= 5) ? 6 : 3;
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
                Narrator.talk("Invalid input! Enter a number between 1 and 10.");
                continue;
            }
            
            attempts++;
            
            //out of range guess
            if (guess < 1 || guess > 10) {
                Narrator.talk("Your guess is out of range! Pick a number between 1 and 10.");
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
                rewardPlayer(attempts);
                break;
            }
        }
        
        //if player runs out of attempts
        if (guess != correctNum) {
            Narrator.talk("You ran out of attempts! Better luck next time.");
            Narrator.talk("The correct number was " + correctNum + ".\n");
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
    private void rewardPlayer(int attempts) {        
        //reward based on number range
        switch (attempts) {
            case 1: 
                //increase constitution
                Narrator.talk("You earned a healing serum!");
                currentGame.getPlayer().setConstitution(currentGame.getPlayer().getConstitution() + 4);
                Narrator.talk("Your health has increased by 4 points.\n");
                break;
            case 2:
                //increase strength
                Narrator.talk("You earned a strength elixir!");
                currentGame.getPlayer().setStrength(currentGame.getPlayer().getStrength() + 5);
                Narrator.talk("Look at those muscles! Your strength has increased by 5 points.\n");
                break;
            case 3:
                //increase agility
                Narrator.talk("You earned an agility cloak!");
                currentGame.getPlayer().setAgility(currentGame.getPlayer().getAgility() + 3);
                Narrator.talk("Go slay you way! Your agility has increased by 3 points.\n");
                break;
            case 4:
                //increase perception
                Narrator.talk("What a beautiful crown!");
                currentGame.getPlayer().setPerception(currentGame.getPlayer().getPerception() + 3);
                Narrator.talk("Your perception has increased by 3 points.\n");
                break;
            case 5:
                //increase luck
                Narrator.talk("You earned a horseshoe! Maybe you'll have better luck next time.");
                currentGame.getPlayer().setLuck(currentGame.getPlayer().getLuck() + 3);
                Narrator.talk("Your luck increased by 3 points.\n");
                break;                
        }
    }
}
