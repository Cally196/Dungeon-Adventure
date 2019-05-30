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
public class MinorManaPotion implements IPredmet {

    @Override
    public String getMeno() {
        return "Minor mana potion";
    }

    @Override
    public String vypisInfo() {
        return "Doplni ti 50 many";
    }

    @Override
    public void pouzi(Hrac hrac) {
        hrac.setMana(50);
        hrac.vymazPredmet(this);
    }
    
}
