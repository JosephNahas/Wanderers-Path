/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Character {
    private String name;
    private int maxHealth;
    private int currentHealth;
    private int armorClass; // Armor class determines if damage taken lowers health or not, the damage number must exceed the armor class
    private Effect[] currentEffects; // list of current buffs and debuffs
    
    public void takeDamage(int damage){ // lower health by damage amount, if damage amount exceeds armor class
        
    }
}
