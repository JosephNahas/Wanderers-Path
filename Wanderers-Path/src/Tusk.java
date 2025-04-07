/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jnguy
 */
public class Tusk extends Enemy {
    public Tusk() {
        super("Tusk, the Earth Colossus", 120, 6);
    }

    @Override
    public void attack(Player player) {
        int damage = 18;
        System.out.println(getName() + " smashes " + player.getName() + " with a Crushing Blow for " + damage + " damage!");
        player.takeDamage(damage);
    }
}