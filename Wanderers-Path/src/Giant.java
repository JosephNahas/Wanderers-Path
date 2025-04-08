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
        String introduction = "As you round the bend in your path, the ground trembles beneath your feet. From between the ancient trees, a towering figure emerges... it's a Giant!";
        this.setIntro(introduction);
    }
     @Override
    public void attack(Player player) {
        int damage = 8;
        System.out.println(getName() + " crushes " + player.getName() + " for " + damage + " damage!");
        player.takeDamage(damage);
    }
}
