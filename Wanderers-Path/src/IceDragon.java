/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jnguy
 */
public class IceDragon extends Enemy {
    public IcreDragon(){
        super("Ice Dragon", 40,7);
}
    public void freeze(Character target) {
        int damage = 6;
        System.out.println(getName() + " breathes icy frost on " + target.getName() + " for " + damage + " damage!");
        target.takeDamage(damage);
        
        Freeze freezeEffect = new Freeze(1);
        target.applyEffect(freezeEffect);
    }
    }
