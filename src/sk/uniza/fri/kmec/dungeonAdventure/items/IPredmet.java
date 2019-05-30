/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.uniza.fri.kmec.dungeonAdventure.items;

import sk.uniza.fri.kmec.dungeonAdventure.game.Hrac;

/**
 * Interface trieda pre predmety
 * @author ASUS_NB
 */
public interface IPredmet {

    String getMeno();

    String vypisInfo();

    void pouzi(Hrac hrac);

}
