/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joseph
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
    private Item[] items;
    private Weapon weapon;
    
    
    public Player(){
        this.strength = minStat;
        this.agility = minStat;
        this.constitution = minStat;
        this.perception = minStat;
        this.luck = minStat;
        items = new Item[0];
        this.canAttack = true;
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
    
    public void increaseStrength(int str){
        this.strength += str;
        if (this.strength > this.maxStat){
            this.strength = this.maxStat;
        }
    }
    
    public void increaseAgility(int agl){
        this.agility += agl;
         if (this.agility > this.maxStat){
            this.agility = this.maxStat;
        }
    }
    
    public void increaseConstitution(int constitution){
        this.constitution += constitution;
         if (this.constitution > this.maxStat){
            this.constitution = this.maxStat;
        }
    }
    
    public void increasePerception(int per){
        this.perception += per;
         if (this.perception > this.maxStat){
            this.perception = this.maxStat;
        }
    }
    
    public void increaseLuck(int luck){
        this.luck += luck;
         if (this.luck > this.maxStat){
            this.luck = this.maxStat;
        }
    }
    
      public void setStrength(int str){
        this.strength = str;
    }
    
    public void setAgility(int agl){
        this.agility = agl;
    }
    
    public void setConstitution(int constitution){
        this.constitution = constitution;
    }
    
    public void setPerception(int per){
        this.perception = per;
    }
    
    public void setLuck(int luck){
        this.luck = luck;
    }
    
    public void decreaseStrength(int amount){
        this.strength -= amount;
    }
    
    public Weapon getWeapon(){
        return this.weapon;
    }
    
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    
    public void collectItem(Item item){ // collect an item and add it to the player's inventory (items array)
        Item[] updatedItems = new Item[items.length + 1];
        if (items.length == 0){
            updatedItems[0] = item;
        } else {
            for (int i = 0; i < items.length; i++){
                updatedItems[i] = items[i];
                if (i == items.length - 1){
                    updatedItems[i+1] = item;
                }
            }
        }
        items = updatedItems;
    }
    
    public void checkStats(){
        Narrator.talk("Strength: " + getStrength());
        Narrator.talk("Agility: " + getAgility());
        Narrator.talk("Constitution: " + getConstitution());
        Narrator.talk("Perception: " + getPerception());
        Narrator.talk("Luck: " + getLuck());
        Narrator.talk("Weapon: " + getWeapon());
        Narrator.talk("Health: " + getCurrentHealth());
        Narrator.lineSeparator();
    }
    
    public void checkItems(){
        if (items.length == 0){
            Narrator.talk("You have no items");
        } else {
            for (Item item : items){
            Narrator.talk(item.toString());
            }
        }
        Narrator.lineSeparator();
    }
}
