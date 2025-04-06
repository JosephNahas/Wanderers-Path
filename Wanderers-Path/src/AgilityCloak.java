/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Joseph
 */
public class AgilityCloak implements Item {

    @Override
    public void applyBonus(Player player, int bonus) {
        player.increaseAgility(bonus);
    }
    
    @Override
    public String toString(){
        return "Agility Cloak";
    }
}
