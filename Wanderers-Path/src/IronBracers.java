/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joseph
 */
public class IronBracers implements Item {

    @Override
    public void applyBonus(Player player, int bonus) {
        player.increaseStrength(bonus);
    }
    
    @Override
    public String toString(){
        return "Iron Bracers";
    }
}
