/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class RubyRing implements Item {

    @Override
    public void applyBonus(Player player, int bonus) {
        player.increaseConstitution(bonus);
    }
    
    @Override
    public String toString(){
        return "Ruby Ring";
    }
}
