/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jnguy
 */
public class DamagePerTurn implements Effect {
    private int duration;
    private int damagePerTurn;
    private String effect;
    
    public DamagePerTurn(int duration, int damagePerTurn, String effect) {
        this.duration = duration;
        this.damagePerTurn = damagePerTurn;
        this.effect = effect;
    }
    
    @Override
    public void applyEffect(Character target) {
        Narrator.talk(target.getName() + " takes " + damagePerTurn + " " + this.effect + " damage!");
        target.takeDamage(damagePerTurn);
        duration--;
    }
    
    public void resolveEffect(Character target){
        Narrator.talk(target.getName() + " is no longer taking " + this.effect + " damage!");
    }
    
    public boolean isExpired(){
        return duration <= 0;
    }
}