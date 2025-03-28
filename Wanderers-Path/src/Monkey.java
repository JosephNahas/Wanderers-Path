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
        super("Monkey", 40, 5);
    }
    
     public void claw(Character target) {
        int damage = 6;
        System.out.println(getName() + " claws " + target.getName() + " for " + damage + " damage!");
        target.takeDamage(damage);
     }
     
     public void attack (Character target){
        int damage = 5;
        System.out.println(getName() + " bites " + target.getName() + " for " + damage + " damage!");
        target.takeDamage(damage);
    }
}
