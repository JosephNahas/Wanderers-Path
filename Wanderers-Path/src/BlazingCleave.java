/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Jnguy
 */
public class BlazingCleave implements Effect {
    private int duration;

    public BlazingCleave(int duration) {
        this.duration = duration;
    }

    @Override
    public void applyEffect(Character target) {
        System.out.println(target.getName() + " is engulfed in flames from Blazing Cleave and will take burn damage for " + duration + " turns!");
        target.applyEffect(new Burn(duration, 7));
    }
}