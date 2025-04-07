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
        super("Kaiser, the Thunder Tyrant", 100, 6);
    }

    @Override
    public void attack(Player player) {
        int choice = (int) (Math.random() * 3);
        
        if (choice != 0 || player.getConstitution() >= 18) {
            int damage = 15;
            System.out.println(getName() + " unleashes Storm Crash on " + player.getName() + " for " + damage + " damage!");
            player.takeDamage(damage);
        } else {
            int damage = 12;
            System.out.println(getName() + " unleashes Thunder Strike on " + player.getName() + " for " + damage + " damage and applies a stun!");
            player.takeDamage(damage);
            
         
            MissTurn stun = new MissTurn("stunned");
            player.setStatusEffect(stun);
        }
    }
}

