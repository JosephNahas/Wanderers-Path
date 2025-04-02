/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anupa
 */
public class NinjaStar {
    
    @Override
    public void applyBonus(Player player, int bonus) {
        player.increaseLuck(bonus);
    }
    
    @Override
    public String toString(){
        return "Ninja Star";
    }
}
