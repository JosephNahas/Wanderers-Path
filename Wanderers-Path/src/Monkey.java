/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jnguy
 */
public class Monkey Extends Enemy{
    public Monkey() {
        super("Monkey", 40, 5);
    }
    @Override
     public void claw(Character target) {
        int damage = 6;
        System.out.println(getName() + " claws " + target.getName() + " for " + damage + " damage!");
        target.takeDamage(damage);
     }
}
