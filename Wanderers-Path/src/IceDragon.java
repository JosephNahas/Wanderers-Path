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
        super("Ice Dragon", 40,7); // 40 is the maxhealth, 7 is the armor class
        String introduction = "A sudden chill sweeps through the air as snow begins to fall from a cloudless sky. From the mountain's frozen peak, a massive Ice Dragon descends";
        this.setIntro(introduction);
    }
    
    public void freeze(Player player) {
        int damage = 6;
        System.out.println(getName() + " breathes icy frost on " + player.getName() + " for " + damage + " damage and applies freeze!");
        player.takeDamage(damage);
        
        MissTurn freezeEffect = new MissTurn("frozen");
        player.setStatusEffect(freezeEffect);
    }
    
    public void attack (Player player){
        int randomMultiplier = 3;
        int choice = (int) (Math.random() * randomMultiplier);
        
        int constitutionCheck = 18;
        if (choice == 0 && player.getConstitution() < constitutionCheck){
            freeze(player);
        } else {
            int damage = 5;
            System.out.println(getName() + " bites " + player.getName() + " for " + damage + " damage!");
            player.takeDamage(damage);
        }
    }
}

