/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Boss extends Enemy {
    public Boss(String name, int maxHealth, int armorClass){
        super(name, maxHealth, armorClass);
    }
    public void performSpecial(){
        // a boss might do a special move that regular enemies cannot, for example lower the player's agility stat for the fight
    }
}
