/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.uniza.fri.kmec.dungeonAdventure.items;

import sk.uniza.fri.kmec.dungeonAdventure.game.Hrac;

/**
 * Kluc potrebny pre vstup do danej miestnosti
 * @author ASUS_NB
 */
public class CathedralKey2 implements IPredmet {

    @Override
    public String getMeno() {
        return "Cathedral key 2";
    }

    @Override
    public String vypisInfo() {
        return "Kluc potrebny pre vstup do The Cathedral";
    }

    @Override
    public void pouzi(Hrac hrac) {

    }

}
