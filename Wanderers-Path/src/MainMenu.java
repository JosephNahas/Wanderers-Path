/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author User
 */
public class MainMenu {
    public boolean run(){
       
        Scanner myScanner = new Scanner(System.in);
        boolean playGame = true;
        do{
            System.out.println("**************Wanderer's Path*****************");
            System.out.println("1. Play Game");
            System.out.println("2. Exit Game");
            String input = myScanner.nextLine();
            if (!input.equals("1") && !input.equals("2")){
                System.out.println("Invalid Input!");
            } else if (input.equals("1")){
                break;
            } else {
                playGame = false;
                System.out.println("Exiting game...");
                break;
            }
        } while (true);
        
        return playGame;
    }
}
