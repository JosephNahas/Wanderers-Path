/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Joseph
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Program starts here
        MainMenu mainMenu = new MainMenu();
        // Run the main menu
        boolean playGame = mainMenu.run();
        if (playGame){ // if player picked play game
            Game myGame = new Game();
            myGame.initialize(); // initialize game
            myGame.run(); // run the game
        } else {
          // quit the program
          
          
          
        }
    }
    
}
