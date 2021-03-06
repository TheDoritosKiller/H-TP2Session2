/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.prog3.tp2a18.vue;

import org.newdawn.slick.SpriteSheet;

/**
 *
 * @author 1742177
 */
public class Feuillage extends Entite implements Bougeable {

    private int deltaX = 4;

    /**
     *Constructeur du feuillage
     * @param x position en x
     * @param y position en y
     * @param spriteSheet source de la sous-image
     */
    public Feuillage(float x, float y, SpriteSheet spriteSheet) {
        super(x, y, spriteSheet, 1, 5);
    }

    /**
     * Gestion du déplacement
     */
    @Override
    public void bouger() {
        if (this.x - deltaX > -32) {
            this.x = x - deltaX;
        } else {
            this.detruire = true;
        }
    }

}
