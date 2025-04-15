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
    
    @Override
    public void resolveEffect(Character target){
        Narrator.talk(target.getName() + " is no longer taking " + this.effect + " damage!");
    }
    
    @Override
    public boolean isExpired(){
        return this.duration <= 0;
    }
    
    public String toString(){
        return (effect + " for " + damagePerTurn + " damage for" + duration + " turns.");
    }
}