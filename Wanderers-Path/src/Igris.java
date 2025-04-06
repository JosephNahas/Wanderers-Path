/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Jnguy
 */
public class Igris extends Enemy {
    public Igris() {
        super("Igris, the Crimson Knight", 100, 12);
    }

    @Override
    public void attack(Character target) {
        int choice = (int) (Math.random() * 2);

        if (choice == 0) {
            int damage = 12;
            System.out.println(getName() + " unleashes a Flaming Slash on " + target.getName() + " for " + damage + " damage and applies burn!");
            target.takeDamage(damage);
            
            if (target.getStatusEffect() == null){
                DamagePerTurn burn = new DamagePerTurn(3, 5, "burn");
                target.setStatusEffect(burn);
            }
        } else {
            int damage = 20;
            System.out.println(getName() + " performs a Blazing Cleave, striking " + target.getName() + " for " + damage + " damage");
            target.takeDamage(damage);
        }
    }
}

