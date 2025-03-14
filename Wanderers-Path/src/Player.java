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
    
    public Player(String name, int maxHealth, int armorClass){
        super(name, maxHealth, armorClass);
    }
}
