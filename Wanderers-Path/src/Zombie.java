/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jnguy
 */
public class Zombie extends Enemy {
    public Zombie() {
        super("Zombie", 25, 5); 
    }

    public void attack(Character target) {
        int damage = 4;
        System.out.println(getName() + " bites " + target.getName() + " for " + damage + " damage!");
        target.takeDamage(damage);
    }
    
    public void infect(Character target){
        Poison infection = new Poison(1, 3); 
        infection.applyEffect(target);
    }
    
}