/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joseph
 */
abstract class Character {
    protected String name;
    protected int maxHealth;
    protected int currentHealth;
    protected Effect statusEffect; 
    protected boolean canAttack;
    
    public void takeDamage(int damage){ // lower health by damage amount
        this.currentHealth -= damage;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getCurrentHealth(){
        return this.currentHealth;
    }
    
    public void setCurrentHealth(int health){
        this.currentHealth = health;
    }
    
    public int getMaxHealth(){
        return this.maxHealth;
    }
    
    public void setCanAttack(boolean canAttack){
        this.canAttack = canAttack;
    }
    
    public boolean getCanAttack(){
        return this.canAttack;
    }
    
    public Effect getStatusEffect(){
        return this.statusEffect;
    }
    
    public void setStatusEffect(Effect effect){
        this.statusEffect = effect;
    }
    
    public void clearEffect(){
        this.statusEffect = null;
    }
}
