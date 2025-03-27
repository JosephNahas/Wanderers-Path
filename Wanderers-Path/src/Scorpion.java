/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jnguy
 */
public class Scorpion extends Enemy{
    public Scorpion() {
        super("Scorpion", 30, 8);
    }
    @Override
    public void attack(Character target){
        int damage = 5;
        System.out.println(getName() + " strings " + target.getName() + " for " + damage + " Damage!");
        
        Poison poison = new Poison(2,2);
        poison.applyEffect(target);
    }
}
