/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joseph
 */
public class HunterCap implements Item {

    @Override
    public void applyBonus(Player player, int bonus) {
        player.increasePerception(bonus);
    }
    
    @Override
    public String toString(){
        return "Hunter's Cap";
    }
}
