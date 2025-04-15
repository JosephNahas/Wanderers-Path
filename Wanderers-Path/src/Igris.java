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
        super("Igris, the Crimson Knight", 100, 6); // 100 is the maxhealth, 6 is the armorclass
        String introduction = "The clang of metal echoes through the silent ruins as a lone figure steps from the shadows. Armor gleaming crimson, etched with dark runes that pulse faintly in the dusk. This is your final challenge";
        this.setIntro(introduction);
    }

    @Override
    public void attack(Player player) { // randomly pick between a regular attack, and a burn attack
        int randomMultiplier = 2;
        int choice = (int) (Math.random() * randomMultiplier);
        
        // if the player has constitution higher than 18, they are immune to burn
        int constitutionCheck = 18;
        if (choice == 0 && player.getConstitution() < constitutionCheck) {
            int damage = 12;
            System.out.println(getName() + " unleashes a Flaming Slash on " + player.getName() + " for " + damage + " damage and applies burn!");
            player.takeDamage(damage);
            
            if (player.getStatusEffect() == null){
                int damagePerTurn = 5;
                int burnDuration = 3;
                DamagePerTurn burn = new DamagePerTurn(burnDuration, damagePerTurn, "burn");
                player.setStatusEffect(burn);
            }
        } else {
            int damage = 20;
            System.out.println(getName() + " performs a Blazing Cleave, striking " + player.getName() + " for " + damage + " damage");
            player.takeDamage(damage);
        }
    }
}

