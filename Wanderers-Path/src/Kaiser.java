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
        super("Kaiser, the Thunder Tyrant", 100, 6); // 100 is the maxhealth, 6 is the armorclass
    }

    @Override
    public void attack(Player player) {
        int randomMultiplier = 3;
        int choice = (int) (Math.random() * randomMultiplier);
        
        int constitutionCheck = 18;
        if (choice != 0 || player.getConstitution() >= constitutionCheck) {
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

