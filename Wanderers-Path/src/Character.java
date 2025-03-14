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
    protected int armorClass; // Armor class determines if damage taken lowers health or not, the damage number must exceed the armor class
    protected Effect[] currentEffects; // list of current buffs and debuffs
    
    public Character(String name, int maxHealth, int armorClass){
        this.name = name;
        this.maxHealth = maxHealth;
        this.armorClass = armorClass;
    }
    
    public void takeDamage(int damage){ // lower health by damage amount, if damage amount exceeds armor class
        
    }
    
    public String getName(){
        return this.name;
    }
}
