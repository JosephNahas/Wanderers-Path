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
        super("Scorpion", 35, 5);
    }
    @Override
    public void attack(Player player){
        int choice = (int) (Math.random() * 3);
        
        if (choice == 0 && player.getConstitution() < 18) {
            int damage = 5;
            System.out.println(getName() + " stings " + player.getName() + " for " + damage + " Damage and applies poison!");
            player.takeDamage(damage);
        
            if (player.getStatusEffect() == null){
                DamagePerTurn poison = new DamagePerTurn(2,2,"poison");
                player.setStatusEffect(poison);
            }
        } else {
            int damage = 7;
            System.out.println(getName() + " claws " + player.getName() + " for " + damage + " damage!");
            player.takeDamage(damage);
        }
    }
}


