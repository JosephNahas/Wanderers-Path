/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Player extends Character {
    // player's stats
    private int strength;
    private int agility;
    private int constitution;
    private int perception;
    private int luck;
    private final int minStat = 10;
    private final int maxStat = 20;
    
    public Player(){
        this.strength = minStat;
        this.agility = minStat;
        this.constitution = minStat;
        this.perception = minStat;
        this.luck = minStat;
        this.maxHealth = 200;
        this.currentHealth = 200;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getMinStat(){
        return minStat;
    }
    
    public int getMaxStat(){
        return maxStat;
    }
    
    public int getStrength(){
        return strength;
    }
    
    public int getAgility(){
        return agility;
    }
    
    public int getConstitution(){
        return constitution;
    }
    
    public int getPerception(){
        return perception;
    }
    
    public int getLuck(){
        return luck;
    }
    
    public void setStrength(int str){
        this.strength += str;
    }
    
    public void setAgility(int agl){
        this.agility += agl;
    }
    
    public void setConstitution(int constitution){
        this.constitution += constitution;
    }
    
    public void setPerception(int per){
        this.perception += per;
    }
    
    public void setLuck(int luck){
        this.luck += luck;
    }
}
