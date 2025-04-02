/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jnguy
 */
public class FlamingSlash implements Effect {
    private int duration;

    public FlamingSlash(int duration) {
        this.duration = duration;
    }

    @Override
    public void applyEffect(Character target) {
        System.out.println(target.getName() + " is set ablaze and will take burn damage for " + duration + " turns!");
        target.applyEffect(new Burn(duration, 5));
    }
}