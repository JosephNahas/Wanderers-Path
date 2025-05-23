/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joseph
 */
abstract class Enemy extends Character {
    protected int armorClass;
    protected String introduction;
    
    public Enemy(String name, int maxHealth, int armorClass){
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.armorClass = armorClass;
    }
    public abstract void attack (Player player);
    
    public int getArmorClass(){
        return this.armorClass;
    }
    
    public String getIntro(){
        return this.introduction;
    }
    
    public void setIntro(String intro){
        this.introduction = intro;
    }
}
