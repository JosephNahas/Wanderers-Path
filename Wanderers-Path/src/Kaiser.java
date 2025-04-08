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
        String introduction = "The sky darkens as storm clouds spiral overhead, crackling with energy. From the heart of the tempest strides a towering figure clad in blackened armor, veins of lightning dancing across his form. This is your final challenge";
        this.setIntro(introduction);
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

