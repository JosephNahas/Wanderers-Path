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
        super("Igris, the Crimson Knight", 100, 15);
    }

    @Override
    public void attack(Character target) {
        int choice = (int) (Math.random() * 2);

        if (choice == 0) {
            int damage = 12;
            System.out.println(getName() + " unleashes a Flaming Slash on " + target.getName() + " for " + damage + " damage!");
            target.takeDamage(damage);

            FlamingSlash flamingSlash = new FlamingSlash(3);
            target.applyEffect(flamingSlash);
        } else {
            int damage = 20;
            System.out.println(getName() + " performs a Blazing Cleave, striking " + target.getName() + " for " + damage + " damage!");
            target.takeDamage(damage);

            BlazingCleave blazingCleave = new BlazingCleave(2);
            target.applyEffect(blazingCleave);
        }
    }
}