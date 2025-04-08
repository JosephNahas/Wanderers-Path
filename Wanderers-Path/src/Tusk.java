/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jnguy
 */
public class Tusk extends Enemy {
    public Tusk() {
        super("Tusk, the Earth Colossus", 120, 6); // 120 is the maxhealth, 6 is the armorclass
        String introduction = "The ground shudders, then splits as a mountain of stone rises before you. Towering and ancient, the Earth Colossus lumbers forward. This is your final challenge";
        this.setIntro(introduction);
    }

    @Override
    public void attack(Player player) {
        int damage = 18;
        System.out.println(getName() + " smashes " + player.getName() + " with a Crushing Blow for " + damage + " damage!");
        player.takeDamage(damage);
    }
}