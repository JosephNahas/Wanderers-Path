/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jnguy
 */
public class IceDragon extends Enemy {
    
    public IceDragon(){
        super("Ice Dragon", 40,7);
    }
    
    public void freeze(Player player) {
        int damage = 6;
        System.out.println(getName() + " breathes icy frost on " + player.getName() + " for " + damage + " damage and applies freeze!");
        player.takeDamage(damage);
        
        MissTurn freezeEffect = new MissTurn("frozen");
        player.setStatusEffect(freezeEffect);
    }
    
    public void attack (Player player){
        int choice = (int) (Math.random() * 3);
        
        if (choice == 0 && player.getConstitution() < 18){
            freeze(player);
        } else {
            int damage = 5;
            System.out.println(getName() + " bites " + player.getName() + " for " + damage + " damage!");
            player.takeDamage(damage);
        }
    }
}

