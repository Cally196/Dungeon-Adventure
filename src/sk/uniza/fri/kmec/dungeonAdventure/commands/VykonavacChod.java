/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.uniza.fri.kmec.dungeonAdventure.commands;

import sk.uniza.fri.kmec.dungeonAdventure.game.Hrac;

/** 
 * Trieda prikazu chod
 * @author ASUS_NB
 */
public class VykonavacChod implements IVykonavac {

    @Override
    public boolean vykonaj(Hrac hrac, String parameter) {

        if (parameter == null) {
            return false;
        }

        if (hrac.chod(parameter)) { //vola triedu chod v hracovi
            return true;
        }

        return false;
    }

}
