/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jnguy
 */
public class Giant extends Enemy {
    public Giant() {
        super("Giant", 50, 12);
    }
     @Override
    public void attack(Character target) {
        int damage = 8;
        System.out.println(getName() + " crushes " + target.getName() + " for " + damage + " damage!");
        target.takeDamage(damage);
    }
}
