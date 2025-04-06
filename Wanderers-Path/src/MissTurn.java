/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jnguy
 */
public class MissTurn implements Effect{
    private int duration;
    private String effect;
            
    public MissTurn(int duration, String effect) {
        this.duration = duration; 
        this.effect = effect;
    }
    
    @Override
    public void applyEffect(Character target){
            System.out.println(target.getName() + " is " + this.effect + " and cannot act for this turn!");
            target.setCanAttack(false);
            duration--;
    }
    
    public void resolveEffect(Character target){
            System.out.println(target.getName() + " is no longer " + this.effect);
            target.setCanAttack(true);
    }
    
    public boolean isExpired() {
        return duration <= 0;
    }
}
