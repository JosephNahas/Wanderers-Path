
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Joseph
 */
public abstract class Weapon {
    protected String scalingPlayerStatString;
    
    public int calculateDamage(Player player){ // calculate the weapon's damage using a formula based on the stat the weapon scales with
        int scalingPlayerStat = 0;
        switch(this.scalingPlayerStatString){
            case "Perception":
                scalingPlayerStat = player.getPerception();
                break;
            case "Strength":
                scalingPlayerStat = player.getStrength();
                break;
            case "Agility":
                scalingPlayerStat = player.getAgility();
                break;
            default:
        }
        Random rand = new Random();
        int dice = 20;
        int diceRoll = rand.nextInt(dice);
        int scalingDivider = 10;
        int scaling = scalingPlayerStat / scalingDivider;
        int damage = diceRoll + scaling; // the final damage is a diceroll plus the stat scaling
        return damage;
    }
}
