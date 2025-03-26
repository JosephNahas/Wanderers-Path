/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jnguy
 */
public class Freeze implements Effect{
    private int duration;
            
    public Freeze(int duration) {
        this.duration = duration; 
    }
    @Override
    public void applyEffect(Character target){
        if (duration > 0) {
             System.out.println(target.getName() + " is frozen and cannot act for this turn!");
            duration--;
            } else {
            System.out.println(target.getName() + " is no longer frozen!");
        }
        }
     public boolean isExpired() {
        return duration <= 0;
    }
}
