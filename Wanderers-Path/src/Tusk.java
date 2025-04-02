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
        super("Tusk, the Earth Colossus", 150, 12);
    }

    @Override
    public void attack(Character target) {
        int damage = 18;
        System.out.println(getName() + " smashes " + target.getName() + " with a Crushing Blow for " + damage + " damage!");
        target.takeDamage(damage);
    }
}