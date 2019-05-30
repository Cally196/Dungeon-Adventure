/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.uniza.fri.kmec.dungeonAdventure.spells;

import sk.uniza.fri.kmec.dungeonAdventure.NPC.INPC;
import sk.uniza.fri.kmec.dungeonAdventure.game.Hrac;

/**
 * Interface trieda pre spelly
 *
 * @author ASUS_NB
 */
public interface ISpell {

    String getNazov();

    int getDamage();

    boolean utok(Hrac hrac, INPC NPC);
}
