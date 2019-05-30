/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.uniza.fri.kmec.dungeonAdventure.commands;

import sk.uniza.fri.kmec.dungeonAdventure.game.Hrac;

/** 
 * Interface trieda pre prikazy
 * @author ASUS_NB
 */
public interface IVykonavac {

    boolean vykonaj(Hrac hrac, String parameter);

}
