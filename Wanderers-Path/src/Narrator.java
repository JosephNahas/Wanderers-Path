/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Narrator {
    public static final int SEPERATOR_COUNT = 60;
    
    public static void talk(String prompt){
        System.out.println(prompt); // present the player with the scenario and its options
    }
    
    public static String getInput(){
        // get the player's choice and return it
        Scanner myScanner = new Scanner(System.in);
       
        return myScanner.nextLine(); // for example player picks option 1
    }
    
    public static void lineSeparator(){
        System.out.println("*".repeat(SEPERATOR_COUNT));
    }
    
    public static void enterContinue(){
        System.out.println("Press Enter to continue...");
        getInput();
    }
    
    public static void askToCheck(Player player){
        boolean resolved = false;
        while (!resolved) {
            System.out.println("1. Continue to next scenario\n2. Check stats\n3. Check items");
            String input = getInput();
            if (!input.equals("1") && !input.equals("2") && !input.equals("3")) {
                System.out.println("Invalid input!");
            } else {
                switch (input) {
                    case "1" -> resolved = true;
                    case "2" -> player.checkStats();
                    default -> player.checkItems();
                }
            }
        }
        
    }
}
