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
        int choice = (int) (Math.random() * 3);
        
        if (choice == 0) {
            int damage = 5;
            System.out.println(getName() + " stings " + target.getName() + " for " + damage + " Damage and applies poison!");
        
            if (target.getStatusEffect() == null){
                DamagePerTurn poison = new DamagePerTurn(2,2,"poison");
                poison.applyEffect(target);
            }
        } else {
            int damage = 7;
            System.out.println(getName() + " claws " + target.getName() + " for " + damage + " damage!");
            target.takeDamage(damage);
        }
    }
}


