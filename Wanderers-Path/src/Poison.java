/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Poison implements Effect {
    private int duration;
    private int damagePerTurn;
    
    public Poison(int duration, int damagePerTurn) {
        this.duration = duration;
        this.damagePerTurn = damagePerTurn;
    }
    
    @Override
    public void applyEffect(Character target){ // one unavoidable damage per turn ?
        if (duration > 0) {
        System.out.println(target.getName() + " takes " + damagePerTurn + " poison damage!");
        target.takeDamage(damagePerTurn);
        duration--;
        }
    }
    public boolean isExpired() {
        return duration <= 0;
    }
}
