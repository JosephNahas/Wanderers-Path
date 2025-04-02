/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jnguy
 */
public class Stun implements Effect {
    private int duration;

    public Stun(int duration) {
        this.duration = duration;
    }

    @Override
    public void applyEffect(Character target) {
        System.out.println(target.getName() + " is stunned and cannot move for " + duration + " turn!");
    }

    public boolean isExpired() {
        return duration <= 0;
    }
}