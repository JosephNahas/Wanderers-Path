/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
abstract class Character {
    protected String name;
    protected int maxHealth;
    protected int currentHealth;
    protected Effect[] currentEffects; // list of current buffs and debuffs
    
    public void takeDamage(int damage){ // lower health by damage amount, if damage amount exceeds armor class
        
    }
    
    public String getName(){
        return this.name;
    }
}
