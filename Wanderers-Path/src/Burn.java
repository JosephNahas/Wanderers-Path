/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jnguy
 */
public class Burn implements Effect {
    private int duration;
    private int damagePerTurn;
    
    public Burn(int duration, int damagePerTurn) {
        this.duration = duration;
        this.damagePerTurn = damagePerTurn;
    }
    
    @Override
    public void applyEffect(Character target) {
        System.out.println(target.getName() + " takes " + damagePerTurn + " burn damage!");
        target.takeDamage(damagePerTurn);
        duration--;
    }
    
    public boolean isExpired(){
        return duration <= 0;
    }
}




