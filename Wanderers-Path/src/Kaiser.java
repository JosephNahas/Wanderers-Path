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
        super("Kaiser, the Thunder Tyrant", 120, 18);
    }

    @Override
    public void attack(Character target) {
        int damage = 15;
        System.out.println(getName() + " unleashes Storm Crash on " + target.getName() + " for " + damage + " damage!");
        target.takeDamage(damage);

        Stun stunEffect = new Stun(1);
        stunEffect.applyEffect(target);
    }
}