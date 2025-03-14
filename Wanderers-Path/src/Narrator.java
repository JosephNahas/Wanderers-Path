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
    public static void talk(String prompt){
        System.out.println(prompt); // present the player with the scenario and its options
    }
    
    public static String getInput(){
        // get the player's choice and return it
        Scanner myScanner = new Scanner(System.in);
       
        return myScanner.nextLine(); // for example player picks option 1
    }
}
