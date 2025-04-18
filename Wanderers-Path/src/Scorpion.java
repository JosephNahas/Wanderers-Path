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
        super("Scorpion", 35, 5); // 35 is the maxhealth, 5 is the armorclass
        String introduction = "The desert wind stills as you step between the sunbaked rocks. From a crack in the sand, a massive scorpion emerges.";
        this.setIntro(introduction);
    }
    @Override
    public void attack(Player player){ // randomly pick between a regular attack, and a poison attack
        int randomMultiplier = 3;
        int choice = (int) (Math.random() * randomMultiplier);
        int constitutionCheck = 18;
        
        // if the player has constitution higher than 18, they are immune to poison
        if (choice == 0 && player.getConstitution() < constitutionCheck) {
            int damage = 5;
            System.out.println(getName() + " stings " + player.getName() + " for " + damage + " Damage and applies poison!");
            player.takeDamage(damage);
        
            if (player.getStatusEffect() == null){
                int poisonDuration = 2;
                int damagePerTurn = 2;
                DamagePerTurn poison = new DamagePerTurn(poisonDuration,damagePerTurn,"poison");
                player.setStatusEffect(poison);
            }
        } else {
            int damage = 7;
            System.out.println(getName() + " claws " + player.getName() + " for " + damage + " damage!");
            player.takeDamage(damage);
        }
    }
}


