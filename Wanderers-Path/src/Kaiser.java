/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jnguy
 */
public class Kaiser extends Enemy {
    public Kaiser() {
        super("Kaiser, the Thunder Tyrant", 100, 11);
    }

    @Override
    public void attack(Character target) {
        int choice = (int) (Math.random() * 3);
        
        if (choice != 0) {
            int damage = 15;
            System.out.println(getName() + " unleashes Storm Crash on " + target.getName() + " for " + damage + " damage!");
            target.takeDamage(damage);
        } else {
            int damage = 12;
            System.out.println(getName() + " unleashes Thunder Strike on " + target.getName() + " for " + damage + " damage and applies a stun!");
            target.takeDamage(damage);
            
         
            MissTurn stun = new MissTurn(1 , "stunned");
            target.setStatusEffect(stun);
            
        }
    }
}

