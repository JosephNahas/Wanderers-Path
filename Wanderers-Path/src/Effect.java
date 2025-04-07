/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Joseph
 */
public interface Effect {
    void applyEffect(Character target); // apply effect during a fight, checked before every turn
    void resolveEffect(Character target);
    boolean isExpired();
}
