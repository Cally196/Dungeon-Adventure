/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.uniza.fri.kmec.dungeonAdventure.items;

import sk.uniza.fri.kmec.dungeonAdventure.game.Hrac;

/**
 * Predmet ktory po použití oznámi že hráč prešiel celú hru
 * @author ASUS_NB
 */
public class WinnerToken implements IPredmet {

    @Override
    public String getMeno() {
        return "Winner Token";
    }

    @Override
    public String vypisInfo() {
        return "Gratulujem k vyhre";
    }

    @Override
    public void pouzi(Hrac hrac) {
        hrac.setVyhra(true);
    }
    
}
