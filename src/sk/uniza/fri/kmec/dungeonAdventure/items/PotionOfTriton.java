/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.uniza.fri.kmec.dungeonAdventure.items;

import sk.uniza.fri.kmec.dungeonAdventure.game.Hrac;

/**
 *
 * @author ASUS_NB
 */
public class PotionOfTriton implements IPredmet {
    @Override
    public String getMeno() {
        return "Potion of Triton";
    }

    @Override
    public String vypisInfo() {
        return "Doplni ti 500 many a 500 energy";
    }

    @Override
    public void pouzi(Hrac hrac) {
        hrac.setMana(500);
        hrac.setEnergy(500);
        hrac.vymazPredmet(this);
    }
}
