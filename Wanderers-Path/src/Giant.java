/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jnguy
 */
public class Giant extends Enemy {
  
    public Giant() {
        super("Giant", 50, 6); // 50 is the maxhealth, 6 is the armor class
    }
     @Override
    public void attack(Player player) {
        int damage = 8;
        System.out.println(getName() + " crushes " + player.getName() + " for " + damage + " damage!");
        player.takeDamage(damage);
    }
}
