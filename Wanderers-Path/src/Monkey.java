/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jnguy
 */
public class Monkey extends Enemy{
    public Monkey() {
        super("Monkey", 30, 5);
    }
    
    public void attack (Player player){
        int damage = 5;
        System.out.println(getName() + " attacks " + player.getName() + " for " + damage + " damage!");
        player.takeDamage(damage);
    }
}
