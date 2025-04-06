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
    
    public void attack (Character target){
        int damage = 5;
        System.out.println(getName() + " attacks " + target.getName() + " for " + damage + " damage!");
        target.takeDamage(damage);
    }
}
