/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.uniza.fri.kmec.dungeonAdventure.commands;

import sk.uniza.fri.kmec.dungeonAdventure.game.Hrac;

/**
 * Trieda prikazu pouzi
 * @author ASUS_NB
 */
public class VykonavacPouzi implements IVykonavac {

    public VykonavacPouzi() {
    }

    @Override
    public boolean vykonaj(Hrac hrac, String parameter) {
        if (hrac.pouziPredmet(parameter)) { //volá metodu pouzi v hracovi
            return true;
        }
        return false;
    }

}
