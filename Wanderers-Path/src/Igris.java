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
        super("Igris, the Crimson Knight", 100, 6);
    }

    @Override
    public void attack(Player player) {
        int choice = (int) (Math.random() * 2);

        if (choice == 0 && player.getConstitution() < 18) {
            int damage = 12;
            System.out.println(getName() + " unleashes a Flaming Slash on " + player.getName() + " for " + damage + " damage and applies burn!");
            player.takeDamage(damage);
            
            if (player.getStatusEffect() == null){
                DamagePerTurn burn = new DamagePerTurn(3, 5, "burn");
                player.setStatusEffect(burn);
            }
        } else {
            int damage = 20;
            System.out.println(getName() + " performs a Blazing Cleave, striking " + player.getName() + " for " + damage + " damage");
            player.takeDamage(damage);
        }
    }
}

