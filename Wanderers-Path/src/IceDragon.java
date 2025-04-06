/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jnguy
 */
public class IceDragon extends Enemy {
    
    public IceDragon(){
        super("Ice Dragon", 40,13);
    }
    
    public void freeze(Character target) {
        int damage = 6;
        System.out.println(getName() + " breathes icy frost on " + target.getName() + " for " + damage + " damage and applies freeze!");
        target.takeDamage(damage);
        
        MissTurn freezeEffect = new MissTurn(1, "frozen");
        target.setStatusEffect(freezeEffect);
    }
    
    public void attack (Character target){
        int choice = (int) (Math.random() * 3);
        
        if (choice == 0){
            freeze(target);
        } else {
            int damage = 5;
            System.out.println(getName() + " bites " + target.getName() + " for " + damage + " damage!");
            target.takeDamage(damage);
        }
    }
}

