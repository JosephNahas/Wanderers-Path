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

    public void attack(Player player) {
        int damage = 4;
        System.out.println(getName() + " bites " + player.getName() + " for " + damage + " damage!");
        player.takeDamage(damage);
    }
}
